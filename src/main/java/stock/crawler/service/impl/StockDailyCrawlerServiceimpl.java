package stock.crawler.service.impl;

import com.google.common.util.concurrent.ListenableFuture;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import stock.common.cache.LocalCache;
import stock.common.constant.EnumCrawerLogStatus;
import stock.common.constant.EnumCrawlerEvent;
import stock.common.constant.EnumLocalCache;
import stock.common.exception.DataParseException;
import stock.common.threads.ThreadPool;
import stock.crawler.service.StockDailyCrawlerService;
import stock.history.dal.dao.CrawlerLogDao;
import stock.history.dal.dao.OrderInfoDao;
import stock.history.dal.dao.StockInfoDao;
import stock.history.dal.model.OrderInfo;
import stock.history.dal.model.StockInfo;
import stock.utils.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by lemon on 10/5/16.
 */
@Service
public class StockDailyCrawlerServiceimpl implements StockDailyCrawlerService {

    @Autowired
    private CrawlerLogDao crawlerLogDao;
    @Autowired
    private StockInfoDao stockInfoDao;
    @Autowired
    private OrderInfoDao orderInfoDao;

    @Value("${data_path}")
    private String DATA_PATH;


    @Override
    public void crawStockDailyInfo() {
        List<StockInfo> list = stockInfoDao.selectAllStockInfo();
        List<ListenableFuture> totalFutureList = new ArrayList<ListenableFuture>();
        for (StockInfo info : list) {
            ListenableFuture future = ThreadPool.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    crawStockDailyInfoByStockCode(info.getStockId());
                    return null;
                }
            });
            totalFutureList.add(future);
        }

        ThreadPool.aWait();
    }


    public static void main(String[] args) {
        String s = " 2016-09-21,'000001,��ָ֤��,   3025.8736,3032,-10.3147, -0.344,,104625697,1.16437377488e+11,,,None";
          //         2016-09-30,'600228,昌九生化,14.86,    15.04,14.12,14.12,14.48,0.38,2.6243,8.6794,20945170,309060007.0,3586015200.0,3586015200.0,None

        String[] elements = s.split(",");
        System.out.println(elements.length);
    }
    private void addOrderInfo(String line){
        if (StringUtils.isNotBlank(line)) {
            String[] elements = line.split(",");

            if(elements.length<16){
                throw new DataParseException(line);
            }

//        日期0,股票代码1,名称2,收盘价3,最高价4,最低价5,开盘价6,前收盘7,涨跌额8,涨跌幅9,换手率10,成交量11,成交金额12,总市值13,流通市值14,成交笔数15
//        2016-09-30,'600228,昌九生化,14.86,15.04,14.12,14.12,14.48,0.38,2.6243,8.6794,20945170,309060007.0,3586015200.0,3586015200.0,None
            OrderInfo info = new OrderInfo();
            info.setOrderId(SerialUtil.generateSerialNo());
            info.setTradeDate(DateUtil.parseDate(elements[0]));
            info.setStockId(elements[1]);
            info.setEndPrice(NumberUtil.parseBigDecimal(elements[3]));
            info.setTopPrice(NumberUtil.parseBigDecimal(elements[4]));
            info.setBottomPrice(NumberUtil.parseBigDecimal(elements[5]));
            info.setBeginPrice(NumberUtil.parseBigDecimal(elements[6]));
            info.setPreviousPrice(NumberUtil.parseBigDecimal(elements[7]));
            info.setShakePrice(NumberUtil.parseBigDecimal(elements[8]));
            info.setShakeRate(NumberUtil.parseBigDecimal(elements[9]));
            info.setTurnRate(NumberUtil.parseBigDecimal(elements[10]));
            info.setTradeQuote(NumberUtil.parseBigDecimal(elements[11]));
            info.setTradeAmount(NumberUtil.parseBigDecimal(elements[12]));
            info.setTotalAmount(NumberUtil.parseBigDecimal(elements[13]));
            info.setUnfrozenAmount(NumberUtil.parseBigDecimal(elements[14]));
            info.setTradeNumber(null);
            orderInfoDao.insertOrderInfo(info);
        }
    }

    @Override
    public void parseStockDailyData(){
        List<StockInfo> list = stockInfoDao.selectAllStockInfo();
        List<ListenableFuture> totalFutureList = new ArrayList<ListenableFuture>();
        for (StockInfo info : list) {
            ListenableFuture future = ThreadPool.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    parseStockDailyDataByStockCode(info.getStockId());
                    return null;
                }
            });
            totalFutureList.add(future);
        }

        ThreadPool.aWait();
    }
    @Override
    public void parseStockDailyDataByStockCode(String stockCode) {
        File dataPath = new File(DATA_PATH);
        File stockFile = new File(dataPath, stockCode);

        if (!stockFile.isFile() || !stockFile.exists()) {
            crawlerLogDao.insertCrawlerLog(stockCode, null, null, EnumCrawlerEvent.STOCK_HISTORY_PARSE, EnumCrawerLogStatus.EXCEPTION, " file not exists");
            return;
        }

        List<String> content = FileUtil.readFile(stockFile, 1);
        for (String line : content) {
            System.out.println(line);
            try{
                addOrderInfo(line);
                crawlerLogDao.insertCrawlerLog(stockCode, null, line, EnumCrawlerEvent.STOCK_HISTORY_PARSE, EnumCrawerLogStatus.SUCCESS, null);

            }catch (Exception e){
                e.printStackTrace();
                crawlerLogDao.insertCrawlerLog(stockCode, null, line, EnumCrawlerEvent.STOCK_HISTORY_PARSE, EnumCrawerLogStatus.EXCEPTION, e.getMessage());
            }
        }
    }

    @Override
    public void crawStockDailyInfoByStockCode(String stockCode) {

        File dataPath = new File(DATA_PATH);
        File stockFile = new File(dataPath, stockCode);
        System.out.println(stockFile);

        if (LocalCache.hitCache(EnumLocalCache.STOCK_HISTORY_FILE_CACHE, stockCode)) {
            System.out.println(stockCode + " has been dealed, skip this stock");
            return;
        }

        //add stock to caches
        LocalCache.put(EnumLocalCache.STOCK_HISTORY_FILE_CACHE, stockCode, Boolean.TRUE);


        String url = "http://quotes.money.163.com/service/chddata.html?code=0" + stockCode + "";
        HttpUtils.getFileFromUrl(url, stockFile);

        String resp = null;
        try {
            HttpUtils.getFileFromUrl(url, stockFile);
            crawlerLogDao.insertCrawlerLog(stockCode, url, resp, EnumCrawlerEvent.STOCK_HISTORY, EnumCrawerLogStatus.SUCCESS, null);
        } catch (Exception e) {
            e.printStackTrace();
            crawlerLogDao.insertCrawlerLog(stockCode, url, resp, EnumCrawlerEvent.STOCK_HISTORY, EnumCrawerLogStatus.EXCEPTION, e.getMessage());
        }
    }

}

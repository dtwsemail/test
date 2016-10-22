package stock.crawler.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stock.common.cache.LocalCache;
import stock.common.constant.EnumCrawerLogStatus;
import stock.common.constant.EnumCrawlerEvent;
import stock.common.constant.EnumLocalCache;
import stock.common.constant.EnumStockLocation;
import stock.crawler.service.StockCodeCrawlerService;
import stock.dal.dao.CrawlerLogDao;
import stock.dal.dao.StockInfoDao;
import stock.dal.model.StockInfo;
import stock.utils.HttpUtils;

/**
 * Created by lemon on 9/5/16.
 */
@Service
public class StockCodeCrawlerServiceImpl implements StockCodeCrawlerService {

    @Autowired
    private CrawlerLogDao crawlerLogDao;
    @Autowired
    private StockInfoDao stockInfoDao;

    /**
     * parse stock code from reponse
     *
     * @param resp
     * @return
     */
    public static String parseStockCodeData(String resp) {
        try {
            if (!StringUtils.isBlank(resp)) {
                System.out.println(resp);
                int startIndex = resp.indexOf("zjlx_bk=");
                int endIndex = resp.indexOf(";var zjlx_rank=");
                System.out.println(startIndex + " " + endIndex);
                if (startIndex != -1 && endIndex != -1) {
                    return resp.substring(startIndex + 8, endIndex);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }



    @Override
    public void crawStockCodeData(String stockCode, EnumStockLocation location) {

        if (LocalCache.hitCache(EnumLocalCache.STOCK_CODE_CACHE, stockCode)) {
            System.out.println(stockCode + " has been dealed, skip this stock");
            return;
        }

        //add stock to cache
        LocalCache.put(EnumLocalCache.STOCK_CODE_CACHE, stockCode, Boolean.TRUE);


        String url = "http://hqchart.eastmoney.com/hq20/js/" + stockCode + ".js";
        String resp = null;
        try {
            resp = HttpUtils.doGet(url);
            StockInfo stockInfo = new StockInfo();
            stockInfo.setStockId(stockCode);
            stockInfo.setLocation(location.getCode());
            String keys = parseStockCodeData(resp);
            stockInfo.setStockType(keys);
            stockInfoDao.insertStockInfo(stockInfo);

            if (StringUtils.isNotBlank(keys)) {
                crawlerLogDao.insertCrawlerLog(stockCode, url, resp, EnumCrawlerEvent.STOCK_CODE, EnumCrawerLogStatus.SUCCESS, null);
            } else {
                crawlerLogDao.insertCrawlerLog(stockCode, url, resp, EnumCrawlerEvent.STOCK_CODE, EnumCrawerLogStatus.F0F, null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            crawlerLogDao.insertCrawlerLog(stockCode, url, resp, EnumCrawlerEvent.STOCK_CODE, EnumCrawerLogStatus.EXCEPTION, e.getMessage());
        }
    }
}

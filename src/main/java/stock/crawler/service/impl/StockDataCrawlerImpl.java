package stock.crawler.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stock.cache.impl.LocalCache;
import stock.common.constant.EnumCrawerLogStatus;
import stock.common.constant.EnumCrawlerEvent;
import stock.common.constant.EnumLocalCache;
import stock.common.constant.EnumStockLocation;
import stock.crawler.service.StockDataCrawler;
import stock.history.dal.dao.CrawlerLogDao;
import stock.history.dal.dao.StockInfoDao;
import stock.history.dal.model.CrawlerLog;
import stock.history.dal.model.StockInfo;
import stock.utils.DateUtil;
import stock.utils.HttpUtils;
import stock.utils.SerialUtil;

/**
 * Created by lemon on 9/5/16.
 */
@Service
public class StockDataCrawlerImpl implements StockDataCrawler {

    @Autowired
    private CrawlerLogDao crawlerLogDao;
    @Autowired
    private StockInfoDao stockInfoDao;

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


    private void addCrawlerLog(String stockId, String url, String response, EnumCrawerLogStatus status, String errorMsg) {
        CrawlerLog log = new CrawlerLog();
        log.setId(SerialUtil.generateSerialNo());
        log.setStockId(stockId);
        log.setRequest(url);
        if (StringUtils.isNotBlank(response)) {

            log.setResponse(response.length() <= 500 ? response : response.substring(0, 500));
        }
        log.setCrawlerEvent(EnumCrawlerEvent.STOCK_CODE.getCode());
        log.setCreateTime(DateUtil.getCurrentDate());
        log.setStatus(status.getCode());
        if (StringUtils.isNotBlank(errorMsg)) {
            log.setErrorMsg(errorMsg.length() < 512 ? errorMsg : errorMsg.substring(0, 512));
        }
        crawlerLogDao.insertCrawlerLog(log);
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
                addCrawlerLog(stockCode, url, resp, EnumCrawerLogStatus.SUCCESS, null);
            } else {
                addCrawlerLog(stockCode, url, resp, EnumCrawerLogStatus.F0F, null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            addCrawlerLog(stockCode, url, resp, EnumCrawerLogStatus.Exception, e.getMessage());
        }
    }
}

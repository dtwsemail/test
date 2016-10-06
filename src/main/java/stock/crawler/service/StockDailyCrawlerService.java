package stock.crawler.service;

/**
 * Created by lemon on 10/5/16.
 */
public interface StockDailyCrawlerService {

    /**
     *  get all stock file
     */
    void crawStockDailyInfo();

    void parseStockDailyData();

    void parseStockDailyDataByStockCode(String stockCode);

    void crawStockDailyInfoByStockCode(String stockCode);
}

package stock.crawler.service;

import stock.common.constant.EnumStockLocation;

/**
 * Created by lemon on 9/5/16.
 */
public interface StockCodeCrawlerService {


    void crawStockCodeData(String stockCode, EnumStockLocation location);
}

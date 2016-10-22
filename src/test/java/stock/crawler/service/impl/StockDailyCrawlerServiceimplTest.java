package stock.crawler.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import stock.base.BaseTest;
import stock.crawler.service.StockDailyCrawlerService;

/**
 * Created by lemon on 10/5/16.
 */
public class StockDailyCrawlerServiceimplTest extends BaseTest {

    @Autowired
    private StockDailyCrawlerService stockDailyCrawlerService;

//    @Test
//    public void crawStockDailyInfoByStockCode() throws Exception {
//        stockDailyCrawlerService.crawlerStockDailyFileByStockCode("000001");
//    }

//    @Test
//    public void crawStockDailyInfo() throws Exception {
//        stockDailyCrawlerService.crawStockDailyInfo( );
//    }


    @Test
    public void parseStockDailyInfo() throws Exception {
//        stockDailyCrawlerService.parseStockDailyData();

        stockDailyCrawlerService.parseStockDailyDataByStockCode("000001");
    }
}
package stock.crawler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import stock.crawler.service.StockDailyCrawlerService;

/**
 * Created by lemon on 10/5/16.
 */
@Controller
public class StockDailyInfoCrawlerController {


    @Autowired
    private StockDailyCrawlerService stockDailyCrawlerService;


    public void getStockDailyInfo() {

        stockDailyCrawlerService.crawStockDailyInfo();
    }
}

package stock.crawler.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import stock.history.service.impl.BaseTest;

/**
 * Created by lemon on 9/6/16.
 */
public class StockCodeCrawlerControllerTest extends BaseTest {
    @Autowired
    private StockCodeCrawlerController stockCodeCrawlerController;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getStockCodeData() throws Exception {
//        stockCodeCrawlerController.getStockCodeData();
    }

}
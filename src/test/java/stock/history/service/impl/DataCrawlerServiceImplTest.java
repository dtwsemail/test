package stock.history.service.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import stock.history.service.DataCrawlerService;

/**
 * Created by lemon on 9/4/16.
 */
public class DataCrawlerServiceImplTest extends BaseTest {

    @Autowired
    private DataCrawlerService dataCrawlerService;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void addOrder() throws Exception {
        dataCrawlerService.addOrder();
    }

}
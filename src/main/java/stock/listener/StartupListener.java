package stock.listener;

/**
 * Created by lemon on 10/21/16.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;
import stock.crawler.service.StockDailyCrawlerService;

@Service
public class StartupListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private StockDailyCrawlerService stockDailyCrawlerService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent evt) {
        if (evt.getApplicationContext().getParent() == null) {
            stockDailyCrawlerService.parseStockDailyData();
        }
    }

}
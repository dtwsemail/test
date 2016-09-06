package stock.crawler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stock.common.constant.EnumStockLocation;
import stock.crawler.service.StockDataCrawler;
import stock.utils.StringUtil;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by lemon on 9/5/16.
 */
@Service
public class StockDataCrawlerController {

    @Autowired
    private StockDataCrawler stockDataCrawler;

    //600xxx
    //000xxx
    //002xxx
    //300xxx
    public void getStockCodeData() {
        System.out.println("begin");
        ExecutorService executorService = Executors.newFixedThreadPool(50);
        for (int i = 0; i <= 999; i++) {
            Integer code = Integer.valueOf(i);
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        EnumStockLocation location = EnumStockLocation.SHANG_HAI;
                        String stockCode = "600" + StringUtil.prefixByLength(code, '0', 3);
                        System.out.println("begin code : " + stockCode);
                        stockDataCrawler.crawStockCodeData(stockCode, location);
                        System.out.println("end code : " + stockCode);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }


        //wait
        try {
            executorService.awaitTermination(99, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}

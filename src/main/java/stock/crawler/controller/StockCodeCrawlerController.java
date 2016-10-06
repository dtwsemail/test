package stock.crawler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import stock.common.constant.EnumStockLocation;
import stock.crawler.service.StockCodeCrawlerService;
import stock.utils.StringUtil;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by lemon on 9/5/16.
 */
@Controller
public class StockCodeCrawlerController {

    @Autowired
    private StockCodeCrawlerService stockCodeCrawlerService;


    //600xxx
    //000sxxx
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
                        EnumStockLocation location = EnumStockLocation.SHEN_ZHEN;
                        String stockCode = "300" + StringUtil.prefixByLength(code, '0', 3);
                        System.out.println("begin code : " + stockCode);
                        stockCodeCrawlerService.crawStockCodeData(stockCode, location);
                        System.out.println("end code : " + stockCode);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        //wait
        try {
            executorService.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}

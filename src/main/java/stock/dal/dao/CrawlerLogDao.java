package stock.dal.dao;

import stock.common.constant.EnumCrawerLogStatus;
import stock.common.constant.EnumCrawlerEvent;
import stock.dal.model.CrawlerLog;

/**
 * Created by lemon on 9/5/16.
 */
public interface CrawlerLogDao {
    int insertCrawlerLog(CrawlerLog log);

    int insertCrawlerLog(String stockId, String url, String response, EnumCrawlerEvent crawlerEvent, EnumCrawerLogStatus status, String errorMsg);
}

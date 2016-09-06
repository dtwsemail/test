package stock.history.dal.dao;

import stock.history.dal.model.CrawlerLog;

/**
 * Created by lemon on 9/5/16.
 */
public interface CrawlerLogDao {
    int insertCrawlerLog(CrawlerLog log);
}

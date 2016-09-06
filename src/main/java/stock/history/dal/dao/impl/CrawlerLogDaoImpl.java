package stock.history.dal.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import stock.history.dal.dao.CrawlerLogDao;
import stock.history.dal.mapper.CrawlerLogMapper;
import stock.history.dal.model.CrawlerLog;

/**
 * Created by lemon on 9/5/16.
 */
@Repository
public class CrawlerLogDaoImpl implements CrawlerLogDao {

    @Autowired
    private CrawlerLogMapper crawlerLogMapper;


    @Override
    public int insertCrawlerLog(CrawlerLog log) {
        return log == null ? 0 : crawlerLogMapper.insert(log);
    }
}

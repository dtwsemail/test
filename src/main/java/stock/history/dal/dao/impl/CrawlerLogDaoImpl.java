package stock.history.dal.dao.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import stock.common.constant.EnumCrawerLogStatus;
import stock.common.constant.EnumCrawlerEvent;
import stock.history.dal.dao.CrawlerLogDao;
import stock.history.dal.mapper.CrawlerLogMapper;
import stock.history.dal.model.CrawlerLog;
import stock.utils.DateUtil;
import stock.utils.SerialUtil;

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

    @Override
    public int insertCrawlerLog(String stockId, String url, String response, EnumCrawlerEvent crawlerEvent, EnumCrawerLogStatus status, String errorMsg) {
        CrawlerLog log = new CrawlerLog();
        log.setId(SerialUtil.generateSerialNo());
        log.setStockId(stockId);
        log.setRequest(url);
        if (StringUtils.isNotBlank(response)) {

            log.setResponse(response.length() <= 500 ? response : response.substring(0, 500));
        }
        log.setCrawlerEvent(crawlerEvent.getCode());
        log.setCreateTime(DateUtil.getCurrentDate());
        log.setStatus(status.getCode());
        if (StringUtils.isNotBlank(errorMsg)) {
            log.setErrorMsg(errorMsg.length() < 512 ? errorMsg : errorMsg.substring(0, 512));
        }
        return insertCrawlerLog(log);
    }

}

package stock.dal.dao.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import stock.dal.dao.StockInfoDao;
import stock.dal.mapper.StockInfoMapper;
import stock.dal.model.StockInfo;
import stock.dal.model.StockInfoExample;

import java.util.List;

/**
 * Created by lemon on 9/5/16.
 */
@Repository
public class StockInfoDaoImpl implements StockInfoDao {

    @Autowired
    private StockInfoMapper stockInfoMapper;


    @Override
    public int insertStockInfo(StockInfo stockInfo) {
        return stockInfo == null ? 0 : stockInfoMapper.insert(stockInfo);
    }

    @Override
    public StockInfo selectByStockCode(String stockCode) {
        if (StringUtils.isBlank(stockCode)) {
            return null;
        }
        return stockInfoMapper.selectByPrimaryKey(stockCode);
    }

    @Override
    public List<StockInfo> selectAllStockInfo(){
        StockInfoExample example = new StockInfoExample();
        return  stockInfoMapper.selectByExample(example);
    }

}

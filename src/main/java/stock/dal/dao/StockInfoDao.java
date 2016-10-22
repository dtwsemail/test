package stock.dal.dao;

import stock.dal.model.StockInfo;

import java.util.List;

/**
 * Created by lemon on 9/5/16.
 */
public interface StockInfoDao {
    int insertStockInfo(StockInfo stockInfo);

    StockInfo selectByStockCode(String stockCode);

    List<StockInfo> selectAllStockInfo();
}

package stock.history.dal.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import stock.history.dal.dao.OrderInfoDao;
import stock.history.dal.mapper.OrderInfoMapper;
import stock.history.dal.model.OrderInfo;

/**
 * Created by lemon on 9/4/16.
 */

@Repository
public class OrderInfoDaoImpl implements OrderInfoDao {

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Override
    public int insertOrderInfo(OrderInfo order) {
        return order == null ? 0 : orderInfoMapper.insert(order);
    }


}

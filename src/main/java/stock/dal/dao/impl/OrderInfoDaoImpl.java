package stock.dal.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import stock.dal.dao.OrderInfoDao;
import stock.dal.mapper.OrderInfoMapper;
import stock.dal.model.OrderInfo;

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

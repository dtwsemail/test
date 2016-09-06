package stock.history.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stock.history.dal.dao.OrderInfoDao;
import stock.history.dal.model.OrderInfo;
import stock.history.service.DataCrawlerService;
import stock.utils.AssertUtil;
import stock.utils.DateUtil;
import stock.utils.SerialUtil;

/**
 * Created by SONY on 2016/8/28.
 */
@Service
public class DataCrawlerServiceImpl implements DataCrawlerService {

    @Autowired
    private OrderInfoDao orderInfoDao;


    @Override
    public void addOrder() {

        OrderInfo order = new OrderInfo();
        order.setOrderId(SerialUtil.generateSerialNo());
        order.setStockId("111");
        order.setTradeDate(DateUtil.getCurrentDate());
        int n = orderInfoDao.insertOrderInfo(order);
        AssertUtil.assertTrue(n > 0, "insert order error");
    }




}

package hfuu.gaofei.drug.service;

import hfuu.gaofei.drug.dao.OrderDao;
import hfuu.gaofei.drug.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: gf
 * @Date: 2021/3/13
 * @Description
 */
@Component(value = "orderService")
public class OrderService {

    @Autowired
    OrderDao orderDao;

    public Long insert(Order order){
        return orderDao.insert(order);
    }

    public List<Order> getListBy(Order order){
        return orderDao.getListBy(order);
    }

    public Boolean update(Order order){
        return orderDao.update(order);
    }

}

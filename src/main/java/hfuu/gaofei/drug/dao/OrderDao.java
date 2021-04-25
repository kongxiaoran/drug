package hfuu.gaofei.drug.dao;

import hfuu.gaofei.drug.entity.Drug;
import hfuu.gaofei.drug.entity.Order;

import java.util.List;
import java.util.Map;

/**
 * @Author: gf
 * @Date: 2021/3/9
 * @Description
 */
public interface OrderDao {

    public long insert(Order entity);

    public boolean update(Order entity);

    public Order getBy(Order entity);

    public List<Order> getListBy(Order order);

}

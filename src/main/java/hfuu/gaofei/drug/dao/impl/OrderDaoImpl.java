package hfuu.gaofei.drug.dao.impl;
import hfuu.gaofei.drug.dao.OrderDao;
import hfuu.gaofei.drug.entity.Order;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author: gf
 * @Date: 2021/3/9
 * @Description
 */
@Repository(value = "orderDao")
public class OrderDaoImpl extends SqlSessionDaoSupport implements OrderDao {

    @Autowired
    protected SqlSessionFactory sqlSessionFactory;

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public SqlSession getSqlSession() {
        return super.getSqlSession();
    }

    @Override
    public long insert(Order entity) {
        this.getSqlSession().insert("hfuu.gaofei.drug.dao.impl.OrderDaoImpl.insert",entity);
        return entity.getId();
    }

    @Override
    public boolean update(Order entity) {
        this.getSqlSession().update("hfuu.gaofei.drug.dao.impl.OrderDaoImpl.update",entity);
        return true;
    }

    @Override
    public Order getBy(Order entity) {
        return this.getSqlSession().selectOne("",entity);
    }

    @Override
    public List<Order> getListBy(Order order) {
        return this.getSqlSession().selectList("hfuu.gaofei.drug.dao.impl.OrderDaoImpl.getListBy",order);
    }

}

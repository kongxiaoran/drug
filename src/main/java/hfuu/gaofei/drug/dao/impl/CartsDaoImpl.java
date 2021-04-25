package hfuu.gaofei.drug.dao.impl;

import hfuu.gaofei.drug.dao.CartsDao;
import hfuu.gaofei.drug.dao.DrugDao;
import hfuu.gaofei.drug.entity.Carts;
import hfuu.gaofei.drug.entity.Drug;
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
@Repository(value = "cartsDao")
public class CartsDaoImpl extends SqlSessionDaoSupport implements CartsDao {

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
    public long insert(Carts entity) {
        this.getSqlSession().insert("hfuu.gaofei.drug.dao.impl.CartsDaoImpl.insert",entity);
        return entity.getId();
    }

    @Override
    public boolean update(Carts entity) {
        this.getSqlSession().update("hfuu.gaofei.drug.dao.impl.CartsDaoImpl.update",entity);
        return true;
    }

    @Override
    public Carts getBy(Carts entity) {
        return this.getSqlSession().selectOne("hfuu.gaofei.drug.dao.impl.CartsDaoImpl.getBy",entity);
    }

    @Override
    public List<Carts> getListBy(Carts carts) {
        return this.getSqlSession().selectList("hfuu.gaofei.drug.dao.impl.CartsDaoImpl.getListBy",carts);
    }

}

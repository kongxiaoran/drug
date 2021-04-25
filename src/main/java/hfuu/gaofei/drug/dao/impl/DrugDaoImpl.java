package hfuu.gaofei.drug.dao.impl;

import hfuu.gaofei.drug.dao.DrugDao;
import hfuu.gaofei.drug.entity.Drug;
import hfuu.gaofei.drug.entity.User;
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
@Repository(value = "drugDao")
public class DrugDaoImpl extends SqlSessionDaoSupport implements DrugDao {

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
    public long insert(Drug entity) {
        return this.getSqlSession().insert("hfuu.gaofei.drug.dao.impl.DrugDaoImpl.insert",entity);
    }

    @Override
    public boolean update(Drug entity) {
        this.getSqlSession().update("hfuu.gaofei.drug.dao.impl.DrugDaoImpl.update",entity);
        return true;
    }

    @Override
    public Drug getBy(Drug entity) {
        return this.getSqlSession().selectOne("",entity);
    }

    @Override
    public List<Drug> getListBy(Map<String, Object> map) {
        return this.getSqlSession().selectList("hfuu.gaofei.drug.dao.impl.DrugDaoImpl.getListBy",map);
    }

}

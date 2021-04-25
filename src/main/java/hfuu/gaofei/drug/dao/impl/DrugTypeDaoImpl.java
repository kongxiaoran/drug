package hfuu.gaofei.drug.dao.impl;

import hfuu.gaofei.drug.dao.DrugDao;
import hfuu.gaofei.drug.dao.DrugTypeDao;
import hfuu.gaofei.drug.entity.Drug;
import hfuu.gaofei.drug.entity.DrugType;
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
@Repository(value = "drugTypeDao")
public class DrugTypeDaoImpl extends SqlSessionDaoSupport implements DrugTypeDao {

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
    public long insert(DrugType entity) {
        return this.getSqlSession().insert("hfuu.gaofei.drug.dao.impl.DrugTypeDaoImpl.insert",entity);
    }

    @Override
    public boolean update(DrugType entity) {
        this.getSqlSession().update("hfuu.gaofei.drug.dao.impl.DrugTypeDaoImpl.update",entity);
        return true;
    }

    @Override
    public DrugType getBy(DrugType entity) {
        return this.getSqlSession().selectOne("hfuu.gaofei.drug.dao.impl.DrugTypeDaoImpl.getBy",entity);
    }

    @Override
    public List<DrugType> getListBy(Map<String, Object> map) {
        return this.getSqlSession().selectList("hfuu.gaofei.drug.dao.impl.DrugTypeDaoImpl.getListBy",map);
    }

}

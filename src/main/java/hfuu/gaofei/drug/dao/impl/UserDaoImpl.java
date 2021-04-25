package hfuu.gaofei.drug.dao.impl;

import hfuu.gaofei.drug.dao.DrugDao;
import hfuu.gaofei.drug.dao.UserDao;
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
@Repository(value = "userDao")
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

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
    public long insert(User entity) {
        return this.getSqlSession().insert("");
    }

    @Override
    public long update(User entity) {
        return this.getSqlSession().update("",entity);
    }

    @Override
    public User getBy(User entity) {
        return this.getSqlSession().selectOne("hfuu.gaofei.drug.dao.impl.UserDaoImpl.getBy",entity);
    }

    @Override
    public List<User> getListBy(Map<String, Object> map) {
        return null;
    }

}

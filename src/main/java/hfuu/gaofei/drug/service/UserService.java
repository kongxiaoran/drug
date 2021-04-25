package hfuu.gaofei.drug.service;

import hfuu.gaofei.drug.dao.UserDao;
import hfuu.gaofei.drug.entity.DrugType;
import hfuu.gaofei.drug.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Author: gf
 * @Date: 2021/3/13
 * @Description
 */
@Component(value = "userService")
public class UserService {

    @Autowired
    UserDao userDao;

    public long insert(User user){
        userDao.insert(user);
        return userDao.insert(user);
    }

    public boolean update(User user){
        userDao.update(user);
        return true;

    }

    public User getBy(User user){
        return userDao.getBy(user);
    }

}

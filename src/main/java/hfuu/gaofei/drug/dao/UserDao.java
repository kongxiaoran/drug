package hfuu.gaofei.drug.dao;


import hfuu.gaofei.drug.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @Author: gf
 * @Date: 2021/3/9
 * @Description
 */
public interface UserDao {

    public long insert(User entity);

    public long update(User entity);

    public User getBy(User entity);

    public List<User> getListBy(Map<String, Object> map);

}

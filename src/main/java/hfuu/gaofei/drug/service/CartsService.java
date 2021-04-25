package hfuu.gaofei.drug.service;

import hfuu.gaofei.drug.dao.CartsDao;
import hfuu.gaofei.drug.entity.Carts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: gf
 * @Date: 2021/3/18
 * @Description
 */
@Component(value = "cartsService")
public class CartsService {

    @Autowired
    CartsDao cartsDao;

    public Long insert(Carts carts){
        return cartsDao.insert(carts);
    }

    public Boolean update(Carts carts){
        return cartsDao.update(carts);
    }

    public Carts getByUserId(Long userId){
        Carts carts = new Carts();
        carts.setUserId(userId);
        return cartsDao.getBy(carts);
    }



}

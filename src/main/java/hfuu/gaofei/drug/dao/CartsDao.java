package hfuu.gaofei.drug.dao;

import hfuu.gaofei.drug.entity.Carts;
import hfuu.gaofei.drug.entity.Drug;

import java.util.List;
import java.util.Map;

/**
 * @Author: gf
 * @Date: 2021/3/9
 * @Description
 */
public interface CartsDao {

    public long insert(Carts entity);

    public boolean update(Carts entity);

    public Carts getBy(Carts entity);

    public List<Carts> getListBy(Carts carts);


}

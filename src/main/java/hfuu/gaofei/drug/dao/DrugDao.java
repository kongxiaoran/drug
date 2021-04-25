package hfuu.gaofei.drug.dao;

import hfuu.gaofei.drug.entity.Drug;

import java.util.List;
import java.util.Map;

/**
 * @Author: gf
 * @Date: 2021/3/9
 * @Description
 */

public interface DrugDao {

    public long insert(Drug entity);

    public boolean update(Drug entity);

    public Drug getBy(Drug entity);

    public List<Drug> getListBy(Map<String,Object> map);



}

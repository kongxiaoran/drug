package hfuu.gaofei.drug.dao;

import hfuu.gaofei.drug.entity.Drug;
import hfuu.gaofei.drug.entity.DrugType;

import java.util.List;
import java.util.Map;

/**
 * @Author: gf
 * @Date: 2021/3/9
 * @Description
 */
public interface DrugTypeDao {

    public long insert(DrugType entity);

    public boolean update(DrugType entity);

    public DrugType getBy(DrugType entity);

    public List<DrugType> getListBy(Map<String, Object> map);

}

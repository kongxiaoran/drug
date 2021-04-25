package hfuu.gaofei.drug.service;

import hfuu.gaofei.drug.dao.DrugDao;
import hfuu.gaofei.drug.dao.DrugTypeDao;
import hfuu.gaofei.drug.entity.Drug;
import hfuu.gaofei.drug.entity.DrugType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Author: gf
 * @Date: 2021/3/13
 * @Description
 */
@Component(value = "drugTypeService")
public class DrugTypeService {

    @Autowired
    DrugTypeDao drugTypeDao;

    public long insert(DrugType drugType){
        drugTypeDao.insert(drugType);
        return drugType.getId();
    }

    public boolean update(DrugType drugType){
        return drugTypeDao.update(drugType);

    }

    public List<DrugType> getListBy(Map<String,Object> map){
        return drugTypeDao.getListBy(map);
    }
}

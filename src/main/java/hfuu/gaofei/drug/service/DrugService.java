package hfuu.gaofei.drug.service;

import hfuu.gaofei.drug.dao.DrugDao;
import hfuu.gaofei.drug.entity.Drug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Author: gf
 * @Date: 2021/3/10
 * @Description
 */

@Component(value = "drugService")
public class DrugService {

    @Autowired
    DrugDao drugDao;

    public long insert(Drug drug){
        drugDao.insert(drug);
        return drug.getId();
    }

    public boolean update(Drug drug){
        return drugDao.update(drug);

    }

    public List<Drug> getListBy(Map<String,Object> map){
        return drugDao.getListBy(map);
    }

}

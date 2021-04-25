package hfuu.gaofei.drug.controller;

import hfuu.gaofei.drug.entity.DrugType;
import hfuu.gaofei.drug.service.DrugTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import java.util.HashMap;

/**
 * @Author: gf
 * @Date: 2021/3/13
 * @Description
 */
@CrossOrigin
@ResponseBody
@RestController
@RequestMapping("/drugType")
public class DrugTypeController {

    @Autowired
    DrugTypeService drugTypeService;


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public long add(@RequestBody DrugType drugType){
        drugTypeService.insert(drugType);
        return drugType.getId();
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public long update(@RequestBody DrugType drugType){
        drugTypeService.update(drugType);
        return drugType.getId();
    }

    @RequestMapping(value = "/getList",method = RequestMethod.POST)
    public List<DrugType> getList(){
        Map<String,Object> map = new HashMap<>();
        return drugTypeService.getListBy(map);
    }

}

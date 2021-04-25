package hfuu.gaofei.drug.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import hfuu.gaofei.drug.entity.Carts;
import hfuu.gaofei.drug.entity.Drug;
import hfuu.gaofei.drug.service.CartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: kxr
 * @Date: 2021/4/3
 * @Description
 */
@CrossOrigin
@ResponseBody
@RestController
@RequestMapping("/carts")
public class CartsController {

    @Autowired
    CartsService cartsService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Long add(@RequestBody Carts carts){
        List<Drug> drugs = JSON.parseArray(carts.getDrugStr(), Drug.class);
        carts.setDrugs(drugs);
        return cartsService.insert(carts);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Boolean update(@RequestBody Carts carts){
        List<Drug> drugs = JSON.parseArray(carts.getDrugStr(), Drug.class);
        carts.setDrugs(drugs);
        return cartsService.update(carts);
    }

    @RequestMapping(value = "/getByUserId",method = RequestMethod.POST)
    public Carts getBy(@RequestParam(value = "userId")Long userId){
        return cartsService.getByUserId(userId);
    }


}

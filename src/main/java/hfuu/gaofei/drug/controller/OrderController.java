package hfuu.gaofei.drug.controller;

import hfuu.gaofei.drug.entity.Order;
import hfuu.gaofei.drug.service.OrderService;
import javafx.scene.chart.ValueAxis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: kxr
 * @Date: 2021/3/13
 * @Description
 */
@CrossOrigin
@ResponseBody
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Long add(@RequestBody  Order order){
        return orderService.insert(order);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Boolean update(@RequestBody  Order order){
        return orderService.update(order);
    }

    @RequestMapping(value = "/getListBy",method = RequestMethod.POST)
    public List<Order> getListBy(@RequestBody Order order){
        return orderService.getListBy(order);
    }


}

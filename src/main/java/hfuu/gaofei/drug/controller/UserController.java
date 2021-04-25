package hfuu.gaofei.drug.controller;

import hfuu.gaofei.drug.entity.User;
import hfuu.gaofei.drug.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: kxr
 * @Date: 2021/3/13
 * @Description
 */
@CrossOrigin
@ResponseBody
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Boolean login(@RequestBody User user){
        user = userService.getBy(user);
        if(user == null){
            return false;
        }
        return true;
    }

}

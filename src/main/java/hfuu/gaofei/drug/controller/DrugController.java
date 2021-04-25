package hfuu.gaofei.drug.controller;

import hfuu.gaofei.drug.entity.Drug;
import hfuu.gaofei.drug.service.DrugService;
import com.alibaba.fastjson.JSON;
import java.util.Map;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 * @Author: gf
 * @Date: 2021/3/10
 * @Description
 */

@CrossOrigin
@ResponseBody
@RestController
@RequestMapping("/drug")
public class DrugController {

    //服务器存放图片的地址
    private String rpath = "/usr/park_cms/apache-tomcat-8.5.55/webapps/file/photos/";
    private String wpath = "D:\\小猪猪\\root";

    //项目的url地址url
    private String url = "http://139.196.6.247:8080/file/photos/";

    @Autowired
    DrugService drugService;
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public long insert(@RequestParam(value = "drug") String drugJson,@RequestParam(value = "file",required = false) MultipartFile file){


        JSONObject jsonObj = JSON.parseObject(drugJson);
        Drug drug = JSON.toJavaObject(jsonObj, Drug.class);

        if(file!=null){
            String name = UUID.randomUUID().toString().replace("-", "")+
                    file.getOriginalFilename();

            File desFile = new File(wpath+name);

            if(!desFile.getParentFile().exists()){
                desFile.getParentFile().mkdirs();
            }

            try {
                file.transferTo(desFile);
            }catch (IllegalStateException | IOException e){
                e.printStackTrace();
            }
            drug.setImgUrl(url+name);
        }

        drugService.insert(drug);

        return drug.getId();
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public boolean update(@RequestParam(value = "drug") String drugJson,@RequestParam(value = "file",required = false) MultipartFile file){

        JSONObject jsonObj = JSON.parseObject(drugJson);

        Drug drug = JSON.toJavaObject(jsonObj, Drug.class);

        if(drug.getId() == null){
            throw new RuntimeException("No Id To Update");
        }

        if(file!=null){
            String name = UUID.randomUUID().toString().replace("-", "")+
                    file.getOriginalFilename();

            File desFile = new File(wpath+name);

            if(!desFile.getParentFile().exists()){
                desFile.getParentFile().mkdirs();
            }

            try {
                file.transferTo(desFile);
            }catch (IllegalStateException | IOException e){
                e.printStackTrace();
            }
            drug.setImgUrl(url+name);
        }

        drugService.update(drug);

        return true;
    }

    @RequestMapping(value = "/getListBy",method = RequestMethod.POST)
    public List<Drug> getListBy(@RequestParam(value = "drugTypeId",required = false)Long drugTypeId,
                                @RequestParam(value = "name",required = false)String name,
                                @RequestParam(value = "content",required = false)String content){
        Map<String,Object> map = new HashMap<>();
        if(drugTypeId != null){
            map.put("drugTypeId",drugTypeId);
        }
        if(name != null){
            map.put("name",name);
        }
        if(content != null){
            map.put("content",content);
        }

        return drugService.getListBy(map);
    }


}

package com.mx.esmms.modules.menu;

import com.alibaba.fastjson.JSONObject;
import com.mx.esmms.common.r.R;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@CrossOrigin
@RequestMapping("/menu")
@Api(tags = "菜单接口")
public class MenuController {

    @GetMapping("/getlist")
    public R getMenuList(){

        JSONObject object2 = new JSONObject();
        object2.put("id",1011);
        object2.put("authName","待拓展");
        object2.put("path","/404");
        object2.put("children","");
        object2.put("order",1);
        List list1 = new ArrayList();
        list1.add(object2);

        JSONObject object3 = new JSONObject();
        object3.put("id",1012);
        object3.put("authName","数据操作");
        object3.put("path","/data");
        object3.put("children","");
        object3.put("order",1);
        List list2 = new ArrayList();
        list2.add(object3);

        JSONObject object = new JSONObject();
        object.put("id",101);
        object.put("authName","待拓展");
        object.put("path","");
        object.put("children",list1);
        object.put("order",1);



        JSONObject object1 = new JSONObject();
        object1.put("id",102);
        object1.put("authName","数据");
        object1.put("path","");
        object1.put("children",list2);
        object1.put("order",2);


        List list = new ArrayList();
        list.add(object1);
        list.add(object);


        return R.ok("获取菜单成功").put("menulist",list);
    }
}

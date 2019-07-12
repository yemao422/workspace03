package com.ym.controller;

import com.alibaba.fastjson.JSON;
import com.ym.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo01 {

    @Autowired
    private UserServiceImpl  userServiceImpl;

    @RequestMapping("/selectuser")
    public String demo01(){
        return  JSON.toJSONString(userServiceImpl.selectAllUser());
    }


    @RequestMapping("/deleteuser/{id}")
    public String  demo02(@PathVariable("id")  int id){
        userServiceImpl.deleteUser(id);
        return "删除成功...";
    }
}

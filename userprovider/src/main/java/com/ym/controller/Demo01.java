package com.ym.controller;

import com.alibaba.fastjson.JSON;
import com.ym.bean.User;
import com.ym.service.UserService;
import com.ym.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Demo01 {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping("/user")
    public String demo01(){
        List<User> list = userServiceImpl.selectAllUser();
        String s = JSON.toJSONString(list);
        return s;
    }
}

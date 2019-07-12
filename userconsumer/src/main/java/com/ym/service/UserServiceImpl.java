package com.ym.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import com.ym.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private RedisTemplate<String,String>  redisTemplate;

    @Reference
    private UserService   userService;
    @Override
    public List<User> selectAllUser() {
        String s = redisTemplate.opsForValue().get("springbootuser");
        System.out.println(s);
        List<User> list = null;
        if(s!=null && s !=""){
            System.out.println("从redis中获取的数据");
            list= JSONObject.parseArray(s, User.class);
        }else {
            System.out.println("从mysql中获取的数据");
            list=userService.selectAllUser();
            String s1 = JSON.toJSONString(list);
            redisTemplate.opsForValue().set("springbootuser",s1);
        }
        return list;
    }


    @Override
    public int deleteUser(int id) {
        int i = userService.deleteUser(id);
        return i;
    }


}

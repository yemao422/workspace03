package com.ym.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisTest {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @RequestMapping("/selectk1")
    public String selectk1(){
        System.out.println(redisTemplate);
        Object user = redisTemplate.opsForValue().get("user");
        System.out.println(user);
        String s = (String) redisTemplate.opsForValue().get("k1");
        System.out.println(s);
        return  s;
    }
}

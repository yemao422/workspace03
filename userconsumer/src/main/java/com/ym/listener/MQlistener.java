package com.ym.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class MQlistener {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @JmsListener(destination = "MQdelete")
    public void deleteRedis(){
        redisTemplate.delete("springbootuser");
    }

}

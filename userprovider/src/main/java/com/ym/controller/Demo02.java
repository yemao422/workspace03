package com.ym.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo02 {

    @Autowired
    private JmsTemplate  jmsTemplate;


    @RequestMapping("/delete")
    public String demo01(){

        jmsTemplate.convertAndSend("SpringbootProvider","delete");
        return "delete";
    }
}

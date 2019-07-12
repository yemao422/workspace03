package com.ym;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.Queue;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserproviderApplicationTests {

    @Autowired
    private JmsTemplate  jmsTemplate;



    @Test
    public void contextLoads() {


        jmsTemplate.convertAndSend("aa01","aa01");


    }

}

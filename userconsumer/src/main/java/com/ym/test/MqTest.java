package com.ym.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

public class MqTest {
    @Autowired
    private JmsTemplate  jmsTemplate;


}

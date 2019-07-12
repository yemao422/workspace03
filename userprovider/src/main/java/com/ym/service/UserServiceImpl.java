package com.ym.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ym.bean.User;
import com.ym.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

import java.util.List;


@Service
@org.springframework.stereotype.Service
public class UserServiceImpl implements  UserService {

    @Autowired
    private   UserDao  userDao;

    @Autowired
    private JmsTemplate  jmsTemplate;
    @Override
    public List<User> selectAllUser() {
        List<User> list = userDao.selectAllUser();

        return list;
    }


    @Override
    public int deleteUser(int id) {
        int delete = userDao.delete(id);
        jmsTemplate.convertAndSend("MQdelete","delete");
        return delete;
    }
}

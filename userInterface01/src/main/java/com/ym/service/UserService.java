package com.ym.service;

import com.ym.bean.User;

import java.util.List;

public interface UserService {
    public List<User> selectAllUser();
    public int deleteUser(int id);
}

package com.ym.dao;

import com.ym.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    public List<User> selectAllUser();
    public int delete(int id);
}

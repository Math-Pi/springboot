package com.springboot.dao;

import org.springframework.stereotype.Repository;

import com.springboot.bean.User;

import java.util.List;

//数据访问层
@Repository
public interface UserDao extends CommonDao<User> {
    List<User> findByName(String name);
}

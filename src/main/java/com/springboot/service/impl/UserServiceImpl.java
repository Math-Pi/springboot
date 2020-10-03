package com.springboot.service.impl;

import com.springboot.bean.BaseBean;
import com.springboot.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.bean.User;
import com.springboot.service.UserService;

import java.util.List;

//业务逻辑层
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void save(User user) {
        userDao.save(user);
    }
    @Override
    public List<User> getUserList() {
        return userDao.findAll();
    }
    @Override
    public void delAllUser(){
        userDao.deleteAll();
    }
    @Override
    public List<User> getUser(String name){
        return userDao.findByName(name);
    }
}
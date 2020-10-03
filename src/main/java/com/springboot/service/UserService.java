package com.springboot.service;

import com.springboot.bean.BaseBean;
import com.springboot.bean.User;

import java.util.List;

public interface UserService {

    /**
     * 保存用户对象
     * @param user
     */
    void save(User user);
    /**
     * 获取所有用户对象
     * @return
     */
    List<User> getUserList();
    /**
     * 删除所有用户
     * @return
     */
    void delAllUser();
    /**
     * 通过名字获取用户(列表)
     * @return
     */
    List<User> getUser(String name);
}
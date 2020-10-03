package com.springboot.controller;

import com.springboot.bean.User;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//页面控制层
@Controller
public class UserController {
    @Autowired  //属性装配
    private UserService userService;
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World !!!";
    }
    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("name", "jack");
        model.addAttribute("age", 20);
        model.addAttribute("info", "我是一个爱学习的好青年");
        return "index";
    }
    @RequestMapping("/save")
    @ResponseBody
    public String save(User user) {
        userService.save(user);
        return "save success !";
    }
    @RequestMapping("/deleteAll")
    @ResponseBody
    public String deleteAll(User user) {
        userService.delAllUser();
        return "delete success !";
    }
    @RequestMapping("/userList")
    public String userList(Model model) {
        List<User> userList = userService.getUserList();
        model.addAttribute("userList", userList);
        return "list";
    }
    @RequestMapping("/getUser")
    @ResponseBody
    public List<User> getUser(){
        List<User> users = userService.getUser("Tom");
        return users;
    }
}
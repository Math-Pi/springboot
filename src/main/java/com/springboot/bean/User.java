package com.springboot.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity     //表明该类 (UserEntity) 为一个实体类
@Table(name = "user")   //指明数据库的表名
public class User extends BaseBean {
    private String name;
    private int age;
    private String info;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
}
package com.springboot.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
//用来标识父类
@MappedSuperclass
public class BaseBean {

    /**
     * 自增长ID
     */
    @Id     //声明一个实体类的属性映射为数据库的主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY) //标注主键的生成策略,IDENTITY：采用数据库ID自增长的方式来自增主键字段
    private Long id;
}
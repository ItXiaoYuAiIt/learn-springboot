package com.itxiaoyuaiit.learnspringboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @ClassName User
 * @Description user实体
 * @Author wuyuqing
 * @Date 2020/8/23 20:04
 * @Version 1.0
 */
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    //设置主键自增，不然hibernate会默认使用序列自增
    private Integer id;

    private String name;

    private Integer age;

    private String job;

    private Date birthday;

    public User() {
    }

    public User(Integer id, String name, Integer age, String job, Date birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.job = job;
        this.birthday = birthday;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}

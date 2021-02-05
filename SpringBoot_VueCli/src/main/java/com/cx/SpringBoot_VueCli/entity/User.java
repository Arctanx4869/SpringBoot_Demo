package com.cx.SpringBoot_VueCli.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class User {

    private String id;
    private String name;
    private Integer age;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GTM+8")
    private Date birth;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                '}';
    }
}

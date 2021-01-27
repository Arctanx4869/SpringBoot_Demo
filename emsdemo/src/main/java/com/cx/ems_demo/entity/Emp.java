package com.cx.ems_demo.entity;

import java.util.Date;

public class Emp {
    private String id;
    private String name;
    private double salary;
    private Integer age;
    private Date birth;

    public Emp(String id, String name, double salary, Integer age, Date birth) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.birth = birth;
    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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
        return "Emp{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", birth=" + birth +
                '}';
    }
}

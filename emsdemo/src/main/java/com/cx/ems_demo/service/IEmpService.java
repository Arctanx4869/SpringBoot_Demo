package com.cx.ems_demo.service;

import com.cx.ems_demo.entity.Emp;

import java.util.List;

public interface IEmpService {

    List<Emp> findAll();

    void saveEmp(Emp emp);

    void delete(String id);

    Emp findById(String id);

    void update(Emp emp);

}

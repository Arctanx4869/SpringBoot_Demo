package com.cx.ems_demo.service.impl;

import com.cx.ems_demo.dao.EmpDao;
import com.cx.ems_demo.entity.Emp;
import com.cx.ems_demo.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class IEmpServiceImpl implements IEmpService {

    @Autowired
    private EmpDao empDao;

    //查询所有员工
    @Override
    public List<Emp> findAll() {
        return empDao.findAll();
    }

    //保存员工
    @Override
    public void saveEmp(Emp emp) {
        emp.setId(UUID.randomUUID().toString());
        empDao.saveEmp(emp);
    }

    //更新员工信息
    @Override
    public void update(Emp emp) {
        empDao.update(emp);
    }

    //根据员工id查询员工信息
    @Override
    public Emp findById(String id) {
        return empDao.findById(id);
    }

    //删除员工
    @Override
    public void delete(String id) {
        empDao.delete(id);
    }
}

package com.cx.ems_demo.controller;

import com.cx.ems_demo.entity.Emp;
import com.cx.ems_demo.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private IEmpService iEmpService;

    //保存所有员工信息
    @PostMapping("/save")
    public String saveEmp(Emp emp){
        iEmpService.saveEmp(emp);
        return "redirect:/emp/findAll";
    }

    //查询所有员工信息
    @GetMapping("findAll")
    public String findAll(Model model){
        List<Emp> emps = iEmpService.findAll();
        model.addAttribute("emps",emps);
        return "ems/emplist";
    }

    //删除员工
    @GetMapping("/delete")
    public String delete(String id){
        iEmpService.delete(id);
        return "redirect:/emp/findAll";
    }

    //根据id查询员工
    @GetMapping("findById")
    public String findById(String id,Model model){
        Emp emp = iEmpService.findById(id);
        model.addAttribute("emp",emp);
        return "/ems/updateEmp";
    }

    //更新员工信息
    @PostMapping("update")
    public String update(Emp emp){
        iEmpService.update(emp);
        return "redirect:/emp/findAll";
    }
}

package com.cx.ems_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/index")
    public String toIndex(){
        return "ems/login";
    }

    @GetMapping("/toRegister")
    public String toRegister(){
        return "ems/register";
    }

    @GetMapping("toSave")
    public String toSave(){
        return "ems/addEmp";
    }

}

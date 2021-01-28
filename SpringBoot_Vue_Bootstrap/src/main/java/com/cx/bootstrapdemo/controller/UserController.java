package com.cx.bootstrapdemo.controller;

import com.cx.bootstrapdemo.entity.User;
import com.cx.bootstrapdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @CrossOrigin
    @GetMapping("findAll")
    public List<User> findAll(){
        List<User> users = iUserService.findAll();
        return users;
    }

}

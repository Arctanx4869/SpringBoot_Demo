package com.cx.SpringBoot_Vue_Router.controller;

import com.cx.SpringBoot_Vue_Router.entity.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("user")
@CrossOrigin
public class Controller {

    @GetMapping("findAll")
    public List<User> findAll(){
        List<User> users = Arrays.asList(
                new User("1","aaa",21,new Date()),
                new User("2","bbb",22,new Date()),
                new User("3","ccc",23,new Date()),
                new User("4","ddd",24,new Date())
        );
        return users;
    }

}

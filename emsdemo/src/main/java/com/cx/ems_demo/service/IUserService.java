package com.cx.ems_demo.service;

import com.cx.ems_demo.entity.User;

public interface IUserService {

    void register(User user);

    User login(String userName, String passWord);

}

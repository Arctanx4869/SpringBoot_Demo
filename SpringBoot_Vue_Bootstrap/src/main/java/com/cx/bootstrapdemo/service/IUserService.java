package com.cx.bootstrapdemo.service;

import com.cx.bootstrapdemo.entity.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();

    void save(User user);

    void deleteUserById(String id);

    User findUserByID(String id);

    void update(User user);

    List<User> findUserByNameOrPhone(String name,String phoneNumber);

}

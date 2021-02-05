package com.cx.SpringBoot_VueCli.service;

import com.cx.SpringBoot_VueCli.entity.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();

    User findUserById(String id);

    void deleteUserById(String id);

    void update(User user);

    void save(User user);

}

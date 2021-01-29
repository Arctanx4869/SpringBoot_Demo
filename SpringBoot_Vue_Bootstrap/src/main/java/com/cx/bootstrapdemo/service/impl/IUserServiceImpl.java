package com.cx.bootstrapdemo.service.impl;

import com.cx.bootstrapdemo.dao.UserDao;
import com.cx.bootstrapdemo.entity.User;
import com.cx.bootstrapdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class IUserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void save(User user) {
        user.setId(UUID.randomUUID().toString());
        userDao.save(user);
    }

    @Override
    public void deleteUserById(String id){
        userDao.deleteUserById(id);
    }

    @Override
    public User findUserByID(String id) {
        return userDao.findUserById(id);
    }

    @Override
    public List<User> findUserByNameOrPhone(String name, String phoneNumber) {
        return userDao.findUserByNameOrPhone(name,phoneNumber);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }
}

package com.cx.ems_demo.service.impl;

import com.cx.ems_demo.dao.UserDao;
import com.cx.ems_demo.entity.User;
import com.cx.ems_demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class IUserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void register(User user) {
        user.setId(UUID.randomUUID().toString());
        userDao.save(user);

    }

    @Override
    public User login(String userName, String passWord) {
        return userDao.login(userName,passWord);
    }
}

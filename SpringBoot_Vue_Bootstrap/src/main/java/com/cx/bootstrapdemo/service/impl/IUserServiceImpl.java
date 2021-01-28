package com.cx.bootstrapdemo.service.impl;

import com.cx.bootstrapdemo.dao.UserDao;
import com.cx.bootstrapdemo.entity.User;
import com.cx.bootstrapdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class IUserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}

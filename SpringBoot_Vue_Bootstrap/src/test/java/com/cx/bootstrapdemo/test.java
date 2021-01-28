package com.cx.bootstrapdemo;

import com.cx.bootstrapdemo.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = SpringBootVueBootstrapApplication.class)
@RunWith(SpringRunner.class)
@MapperScan("com.cx.bootstrapdemo.dao")
public class test {

    @Autowired
    UserDao userDao;

    @Test
    public void testFindAll(){
        System.out.println(userDao.findAll().toString());
    }
}

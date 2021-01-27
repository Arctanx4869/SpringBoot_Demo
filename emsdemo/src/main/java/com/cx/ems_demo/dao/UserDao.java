package com.cx.ems_demo.dao;

import com.cx.ems_demo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    @Insert("insert into t_user values(#{user.id},#{user.userName},#{user.realName},#{user.passWord},#{user.sex})")
    void save(@Param("user") User user);

    @Select("select id,username,realname,password,sex from t_user where username = #{userName} and password = #{passWord}")
    User login(@Param("userName") String userName, @Param("passWord") String passWord);

}

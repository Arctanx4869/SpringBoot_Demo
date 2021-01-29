package com.cx.bootstrapdemo.dao;

import com.cx.bootstrapdemo.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    @Select("select * from user")
    List<User> findAll();

    @Select("select * from user where id = #{id}")
    User findUserById(String id);

    @Select({"<script>",
            "select id,name,age,salary,phoneNumber from user",
            "<where>",
            "<if test='name != null'>",
            "name like concat(#{name},'%')",
            "</if>",
            "<if test='phoneNumber != null'>",
            "or phoneNumber like concat('%',#{phoneNumber},'%')",
            "</if>",
            "</where>",
            "</script>"
    })
    List<User> findUserByNameOrPhone(@Param("name") String name,@Param("phoneNumber") String phoneNumber);

    @Insert("insert into user values (#{id},#{name},#{age},#{salary},#{phoneNumber})")
    void save(User user);

    @Delete("delete from user where id = #{id}")
    void deleteUserById(String id);

    @Update("update user set name = #{name},age = #{age},salary = #{salary},phoneNumber = #{phoneNumber} where id = #{id}")
    void update(User user);

}

package com.cx.SpringBoot_VueCli.dao;

import com.cx.SpringBoot_VueCli.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserDao {

    @Select("select * from user1")
    List<User> findAll();

    @Select("select * from user1 where id = #{id}")
    User findUserById(String id);

    @Delete("delete from user1 where id = #{id}")
    void deleteUserById(String id);

    @Update("update user1 set name = #{name},age = #{age},birth = #{birth} where id = #{id}")
    void update(User user);

    @Insert("insert into user1 values (#{id},#{name},#{age},#{birth})")
    void save(User user);
}

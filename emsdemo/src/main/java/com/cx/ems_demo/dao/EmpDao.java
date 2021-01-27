package com.cx.ems_demo.dao;

import com.cx.ems_demo.entity.Emp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpDao {

    @Select("select * from t_emp")
    List<Emp> findAll();

    @Insert("insert into t_emp values(#{id},#{name},#{salary},#{age},#{birth})")
    void saveEmp(Emp emp);

    @Delete("delete from t_emp where id = #{id}")
    void delete(String id);

    @Select("select * from t_emp where id = #{id}")
    Emp findById(String id);

    @Update("update t_emp set name = #{name},salary = #{salary},age = #{age},birth = #{birth} where id = #{id}")
    void update(Emp emp);
}

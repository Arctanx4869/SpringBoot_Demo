package com.cx.SpringBoot_VueCli.controller;


import com.cx.SpringBoot_VueCli.entity.User;
import com.cx.SpringBoot_VueCli.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("findAll")
    public List<User> findAll(){
        List<User> users = iUserService.findAll();
        return users;
    }

    @PostMapping("add")
    public Map<String,Object> save(@RequestBody User user){
        HashMap<String,Object> map = new HashMap<>();
        try {
            iUserService.save(user);
            map.put("isSuccess",true);
            map.put("msg","用户添加成功");
        }catch (Exception exception){
            exception.printStackTrace();
            map.put("isSuccess",false);
            map.put("msg","用户添加失败：" + exception.getMessage());
        }
        return map;
    }

    @GetMapping("deleteUserById")
    public Map<String,Object> deleteUserById(String id){
        HashMap<String,Object> map = new HashMap<>();
        try {
            iUserService.deleteUserById(id);
            map.put("isSuccess",true);
            map.put("msg","用户删除成功");
        }catch (Exception exception){
            exception.printStackTrace();
            map.put("isSuccess",false);
            map.put("msg","用户删除失败：" + exception.getMessage());
        }
        return map;
    }

    @GetMapping("/findUserById")
    public User findUserById(String id){
        return iUserService.findUserById(id);
    }

    @PostMapping("update")
    public Map<String,Object> update(@RequestBody User user){
        HashMap<String,Object> map = new HashMap<>();
        try {
            iUserService.update(user);
            map.put("isSuccess",true);
            map.put("msg","用户修改成功");
        }catch (Exception exception){
            exception.printStackTrace();
            map.put("isSuccess",false);
            map.put("msg","用户修改失败：" + exception.getMessage());
        }
        return map;
    }
}

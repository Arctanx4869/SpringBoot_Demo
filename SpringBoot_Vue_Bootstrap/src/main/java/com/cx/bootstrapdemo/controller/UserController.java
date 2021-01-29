package com.cx.bootstrapdemo.controller;

import com.cx.bootstrapdemo.entity.User;
import com.cx.bootstrapdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("findAll")
    public List<User> findAll(){
        List<User> users = iUserService.findAll();
        return users;
    }

    @GetMapping("findUserByNameOrPhone")
    public List<User> findUserByNameOrPhone(String name, String phoneNumber){
        return iUserService.findUserByNameOrPhone(name,phoneNumber);
    }

    @PostMapping("save")
    public Map<String,Object> save(@RequestBody User user){
        Map<String,Object> map = new HashMap<>();
        try {
            if(StringUtils.isEmpty(user.getId())){
                iUserService.save(user);
            }else {
                iUserService.update(user);
            }
            map.put("isSuccess",true);
        }catch (Exception e){
            map.put("isSuccess",false);
            map.put("message","用户保存或更新失败");
        }
        return map;
    }

    @GetMapping("deleteUserById")
    public Map<String,Object> deleteUserById(String id){
        Map<String,Object> map = new HashMap<>();
        try {
            iUserService.deleteUserById(id);
            map.put("isSuccess",true);
        }catch (Exception e){
            map.put("isSuccess",false);
            map.put("message","删除用户失败");
        }
        return map;
    }

    @GetMapping("findUserById")
    public User findUserByID(String id){
        return iUserService.findUserByID(id);
    }

}

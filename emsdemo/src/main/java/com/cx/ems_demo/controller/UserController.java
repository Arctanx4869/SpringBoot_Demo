package com.cx.ems_demo.controller;

import com.cx.ems_demo.entity.User;
import com.cx.ems_demo.service.IUserService;
import com.cx.ems_demo.utils.ValidateImageCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    //注册信息
    @PostMapping("/register")
    public String register(User user,String code,HttpSession session){
        String sessionCode = (String) session.getAttribute("code");
        if(sessionCode.equalsIgnoreCase(code)){   //session中拿到用户填写的sessionCode和生成的code做对比
            iUserService.register(user);
            return "redirect:/index";   //跳转到登录页面
        }else {
            return "redirect:/toRegister";   //跳转到注册页面
        }

    }

    //登录
    @PostMapping("/login")
    public String login(String userName,String passWord,HttpSession session){
        User loginUser = iUserService.login(userName,passWord);
        if(loginUser != null){
            session.setAttribute("loginUser",loginUser);
            return "redirect:/emp/findAll";   //跳转到所有员工信息页面
        }else{
            return "redirect:/index";
        }
    }

    //生成验证码
    @GetMapping("/code")
    public void getImage(HttpSession session, HttpServletResponse response) throws IOException {

        //生成验证码
        String securityCode = ValidateImageCodeUtils.getSecurityCode();
        BufferedImage image = ValidateImageCodeUtils.createImage(securityCode);
        //存入session作用域
        session.setAttribute("code",securityCode);
        //响应图片
        ServletOutputStream os = response.getOutputStream();
        ImageIO.write(image,"png",os);
    }

}

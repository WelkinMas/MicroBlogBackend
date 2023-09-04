package com.atguigu.blog.controller;


import com.atguigu.blog.pojo.User;
import com.atguigu.blog.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public User testController(){
        return testService.findUserById(1);
    }
}

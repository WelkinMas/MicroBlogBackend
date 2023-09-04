package com.atguigu.blog.controller;


import com.atguigu.blog.pojo.User;
import com.atguigu.blog.service.UserService;
import com.atguigu.blog.utils.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Tag(name="用户控制器")
@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Operation(summary = "用户登陆")
    @PostMapping("/login")
    public Result login(@RequestBody User user){
        User userStored = userService.login(user);
        if(userStored != null){
            Map<String, Object> map = new HashMap<>();
            map.put("name", userStored.getUsername());
            map.put("uid",userStored.getUid());
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    @Operation(summary = "用户注册")
    @PostMapping("/register")
    public Result register(@RequestBody User user){
        boolean isSuccessful = userService.register(user);
        if(isSuccessful){
            return Result.ok();
        }else {
            return Result.fail();
        }
    }

    @Operation(summary = "用户信息修改")
    @PostMapping
    public Result updateUser(@RequestBody User user){
        userService.updateUser(user);
        return Result.ok();
    }
}

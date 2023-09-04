package com.atguigu.blog.service;

import com.atguigu.blog.pojo.User;

public interface UserService {
    User login(User user);

    boolean register(User user);

    void updateUser(User user);

}

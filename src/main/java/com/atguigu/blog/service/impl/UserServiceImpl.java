package com.atguigu.blog.service.impl;

import com.atguigu.blog.mapper.UserMapper;
import com.atguigu.blog.pojo.User;
import com.atguigu.blog.service.UserService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(User userEntered) {
        User userStored= userMapper.getUserById(userEntered.getUid());
        if(userStored == null){
            return null;
        }
        if(userStored.getPassword().equals(userEntered.getPassword())){
            return userStored;
        }else {
            return null;
        }
    }

    @Override
    public boolean register(User userEntered) {
        User userStored= userMapper.getUserById(userEntered.getUid());
        if (userStored == null){
            userMapper.addUser(userEntered);
            return true;
        }
        return false;
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }
}

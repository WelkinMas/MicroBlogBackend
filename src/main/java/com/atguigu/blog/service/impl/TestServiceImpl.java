package com.atguigu.blog.service.impl;

import com.atguigu.blog.mapper.TestMapper;
import com.atguigu.blog.pojo.User;
import com.atguigu.blog.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestMapper testMapper;
    @Override
    public User findUserById(int i) {
        User userById = testMapper.findUserById(i);
        return userById;
    }
}

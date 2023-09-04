package com.atguigu.blog.mapper;

import com.atguigu.blog.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User getUserById(Integer uid);

    void addUser(User user);

    void updateUser(User user);

}

package com.atguigu.blog.mapper;


import com.atguigu.blog.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TestMapper {


    User findUserById(@Param("uid") int i);
}

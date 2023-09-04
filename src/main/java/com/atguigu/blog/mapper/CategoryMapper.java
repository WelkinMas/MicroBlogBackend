package com.atguigu.blog.mapper;

import com.atguigu.blog.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<Category> queryList(Category category);

    List<Category> findPage(@Param("beginIndex")int beginIndex,@Param("pageSize") int pageSize,@Param("category") Category category);

    void addCategory(Category category);

    void deleteCategory(int cid);

    void updateCategory(Category category);

}

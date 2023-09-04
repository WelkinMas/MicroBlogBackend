package com.atguigu.blog.service;

import com.atguigu.blog.pojo.Category;

import java.util.List;
import java.util.Map;

public interface CategoryService {
    List<Category> queryList(Category category);

    Map findPage(int pageNum, int pageSize,Category category);

    void addCategory(Category category);

    void deleteCategory(int cid);

    void updateCategory(Category category);

}

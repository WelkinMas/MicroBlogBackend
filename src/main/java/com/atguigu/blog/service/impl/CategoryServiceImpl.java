package com.atguigu.blog.service.impl;

import com.atguigu.blog.mapper.CategoryMapper;
import com.atguigu.blog.pojo.Category;
import com.atguigu.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> queryList(Category category) {
        List<Category> list= categoryMapper.queryList(category);
        return list;
    }

    @Override
    public Map findPage(int pageNum, int pageSize, Category category) {
        int beginIndex = (pageNum-1)*pageSize;
        List<Category> page = categoryMapper.findPage(beginIndex, pageSize,category);
        int entryCount = categoryMapper.queryList(category).size();
        Map<String,Object> pageInfo = new HashMap<>();
        pageInfo.put("entryCount",entryCount);
        pageInfo.put("page",page);
        return pageInfo;
    }

    @Override
    public void addCategory(Category category) {
        categoryMapper.addCategory(category);
    }

    @Override
    public void deleteCategory(int cid) {
        categoryMapper.deleteCategory(cid);
    }

    @Override
    public void updateCategory(Category category) {
        categoryMapper.updateCategory(category);
    }
}

package com.atguigu.blog.controller;

import com.atguigu.blog.pojo.Category;
import com.atguigu.blog.service.CategoryService;
import com.atguigu.blog.utils.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@Tag(name = "分类控制器")
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @Operation(summary = "查询文章分类列表")
    @PostMapping("/queryList")
    public Result queryList(@RequestBody(required = false) Category category){
        List<Category> list= categoryService.queryList(category);
        return Result.ok(list);
    }

    @Operation(summary = "分页查询文章分类")
    @PostMapping("/{pageNum}/{pageSize}")
    public Result queryListPage(
            @PathVariable int pageNum,
            @PathVariable int pageSize,
            @RequestBody(required = false) Category category){
        Map pageInfo = categoryService.findPage(pageNum, pageSize,category);
        return Result.ok(pageInfo);
    }

    @Operation(summary = "添加文章分类")
    @PostMapping
    public Result addCategory(@RequestBody Category category){
        categoryService.addCategory(category);
        return Result.ok();
    }

    @Operation(summary = "修改文章分类")
    @PutMapping
    public Result updateCategory(@RequestBody Category category){
        categoryService.updateCategory(category);
        return Result.ok();
    }

    @Operation(summary = "删除文章分类")
    @DeleteMapping("/{cid}")
    public Result deleteCategory(@PathVariable int cid){
        categoryService.deleteCategory(cid);
        return Result.ok();
    }
}

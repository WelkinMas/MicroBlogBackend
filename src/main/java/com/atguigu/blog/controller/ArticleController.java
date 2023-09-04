package com.atguigu.blog.controller;

import com.atguigu.blog.pojo.Article;
import com.atguigu.blog.service.ArticleService;
import com.atguigu.blog.utils.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Tag(name = "文章控制器")
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Operation(summary = "查询文章列表")
    @PostMapping("/queryList")
    public Result queryList(@RequestBody(required = false) Article article){
        List<Article> list = articleService.queryList(article);
        return Result.ok(list);
    }

    @Operation(summary = "添加文章信息")
    @PostMapping
    public Result addArticle(@RequestBody Article article){
        articleService.addArticle(article);
        return Result.ok();
    }

    @Operation(summary = "根据id获取单个文章信息")
    @GetMapping("/{id}")
    public Result getArticle(@PathVariable int id){
        Article article = articleService.getArticle(id);
        return Result.ok(article);
    }

    @Operation(summary = "修改文章信息")
    @PutMapping
    public Result updateArticle(@RequestBody Article article){
        articleService.updateArticle(article);
        return Result.ok();
    }

    @Operation(summary = "根据id删除文章")
    @DeleteMapping("/{id}")
    public Result deleteArticle(@PathVariable int id){
        articleService.deleteArticle(id);
        return Result.ok();
    }
}

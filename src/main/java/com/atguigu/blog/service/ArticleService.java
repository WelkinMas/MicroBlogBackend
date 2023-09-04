package com.atguigu.blog.service;

import com.atguigu.blog.mapper.ArticleMapper;
import com.atguigu.blog.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ArticleService {

    List<Article> queryList(Article article);

    void addArticle(Article article);

    Article getArticle(int id);

    void updateArticle(Article article);

    void deleteArticle(int id);
}

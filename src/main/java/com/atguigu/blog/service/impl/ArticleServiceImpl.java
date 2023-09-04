package com.atguigu.blog.service.impl;

import com.atguigu.blog.mapper.ArticleMapper;
import com.atguigu.blog.pojo.Article;
import com.atguigu.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<Article> queryList(Article article) {
        return articleMapper.queryList(article);
    }

    @Override
    public void addArticle(Article article) {
        articleMapper.addArticle(article);
    }

    @Override
    public Article getArticle(int id) {
        return articleMapper.getArticle(id);
    }

    @Override
    public void updateArticle(Article article) {
        articleMapper.updateArticle(article);
    }

    @Override
    public void deleteArticle(int id) {
        articleMapper.deleteArticle(id);
    }
}

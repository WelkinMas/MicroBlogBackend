package com.atguigu.blog.mapper;

import com.atguigu.blog.pojo.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ArticleMapper {
    List<Article> queryList(Article article);

    void addArticle(Article article);

    Article getArticle(int id);

    void updateArticle(Article article);

    void deleteArticle(int id);
}

package com.atguigu.blog.pojo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Schema(name="文章信息")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    @Schema(description = "文章id")
    private Long id;
    @Schema(description = "文章标题")
    private String title; //文章标题
    @Schema(description = "文章内容")
    private String content; //文章内容
    @Schema(description = "文章分类id")
    private Long cid; //分类id
    @Schema(description = "文章所属用户id")
    private Long uid; //用户id
    @Schema(description = "文章创建时间")
    private Date createTime;
    @Schema(description = "文章修改时间")
    private Date updateTime;
}

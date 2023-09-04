package com.atguigu.blog.pojo;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Schema(description = "分类信息")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Schema(description = "分类id")
    private Long cid;
    @Schema(description = "分类名称")
    private String cname; //分类名称
    @Schema(description = "分类创建时间")
    private Date create_time;
    @Schema(description = "分类修改时间")
    private Date update_time;
}

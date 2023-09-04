package com.atguigu.blog.pojo;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Schema(description = "用户信息")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Schema(description = "用户id")
    private Integer uid;
    @Schema(description = "用户名称")
    private String username;
    @Schema(description = "密码")
    private String password;
    @Schema(description = "电话号码")
    private String phone;
    @Schema(description = "自我介绍")
    private String introduction;
    @Schema(description = "用户创建时间")
    private String createTime;
    @Schema(description = "用户信息修改时间")
    private String updateTime;
}

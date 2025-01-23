package com.example.usercenter.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Create 01/2025
 * @Author xiao
 * @Description
 */

@Data
@TableName("user")
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
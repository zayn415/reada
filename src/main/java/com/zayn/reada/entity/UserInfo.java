package com.zayn.reada.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 用户信息(UserInfo)实体类
 *
 * @author zayn
 * @since 2025-05-05 20:44:21
 */
@Data
@TableName("user_info")
public class UserInfo {
    /**
     * 用户信息ID
     */
    @TableId("info_id")
    private Long infoId;
    
    /**
     * 用户ID
     */
    @TableField("user_id")
    private Long userId;
    
    /**
     * 昵称
     */
    @TableField("nickname")
    private String nickname;
    
    /**
     * 头像URL
     */
    @TableField("avatar_url")
    private String avatarUrl;
    
    /**
     * 性别
     */
    @TableField("gender")
    private String gender;
    
    /**
     * 生日
     */
    @TableField("birthday")
    private Date birthday;
    
    /**
     * 简介
     */
    @TableField("bio")
    private String bio;
    
    /**
     * 地区
     */
    @TableField("locale")
    private String locale;
    
    /**
     * 创建时间
     */
    @TableField("created_at")
    private Date createdAt;
    
    /**
     * 更新时间
     */
    @TableField("updated_at")
    private Date updatedAt;
    
}


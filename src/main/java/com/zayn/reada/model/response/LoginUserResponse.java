package com.zayn.reada.model.response;

import lombok.Data;

import java.util.Date;

/**
 * 登录用户响应体
 *
 * @author zayn
 * @since 2025/5/8
 */
@Data
public class LoginUserResponse {
    
    /**
     * 用户ID
     */
    private Long userId;
    
    /**
     * 手机号
     */
    private String phone;
    
    /**
     * 微信openid
     */
    private String wechatOpenid;
    
    /**
     * 微信unionid
     */
    private String wechatUnionid;
    
    /**
     * 用户名
     */
    private String nickname;
    
    /**
     * 头像
     */
    private String avatarUrl;
    
    /**
     * 性别
     */
    private String gender;
    
    /**
     * 生日
     */
    private Date birthday;
    
    /**
     * 简介
     */
    private String bio;
    
    /**
     * 地区
     */
    private String locale;
}

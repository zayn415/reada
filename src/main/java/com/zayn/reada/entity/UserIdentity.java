package com.zayn.reada.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 用户身份(UserIdentity)实体类
 *
 * @author zayn
 * @since 2025-05-05 20:48:25
 */
@Data
@TableName("user_identity")
public class UserIdentity {
    /**
     * 身份ID
     */
    @TableId("identity_id")
    private Long identityId;
    
    /**
     * 用户ID
     */
    @TableField("user_id")
    private Long userId;
    
    /**
     * 身份类型，如手机号、邮箱、用户名等
     */
    @TableField("identity_type")
    private String identityType;
    
    /**
     * 身份值，如手机号、邮箱、用户名等
     */
    @TableField("identity_value")
    private String identityValue;
    
    /**
     * 凭证，如密码、验证码等
     */
    @TableField("credential")
    private String credential;
    
    /**
     * 是否验证
     */
    @TableField("verified")
    private Integer verified;
    
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


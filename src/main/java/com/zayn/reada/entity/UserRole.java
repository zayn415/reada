package com.zayn.reada.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户-角色(UserRole)实体类
 *
 * @author zayn
 * @since 2025-05-05 20:49:25
 */
@Data
@TableName("UserRole")
public class UserRole {
    @TableField("userId")
    private Long userId;
    
    @TableField("roleId")
    private Long roleId;
    
}


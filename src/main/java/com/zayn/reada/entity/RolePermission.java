package com.zayn.reada.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 角色-权限(RolePermission)实体类
 *
 * @author zayn
 * @since 2025-05-05 20:49:25
 */
@Data
@TableName("RolePermission")
public class RolePermission {
    @TableField("roleId")
    private Long roleId;
    
    @TableField("permId")
    private Long permId;
    
}


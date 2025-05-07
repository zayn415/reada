package com.zayn.reada.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 角色(Role)实体类
 *
 * @author zayn
 * @since 2025-05-05 20:49:25
 */
@Data
@TableName("role")
public class Role {
    /**
     * 角色ID
     */
    @TableId("role_id")
    private Long roleId;
    
    /**
     * 角色名称
     */
    @TableField("role_name")
    private String roleName;
    
}


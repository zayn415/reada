package com.zayn.reada.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 权限(Permission)实体类
 *
 * @author zayn
 * @since 2025-05-05 20:49:25
 */
@Data
@TableName("Permission")
public class Permission {
    /**
     * 权限ID
     */
    @TableField("permId")
    private Long permId;
    
    /**
     * 权限代码
     */
    @TableField("permCode")
    private String permCode;
    
    /**
     * 权限描述
     */
    @TableField("description")
    private String description;
    
}


package com.zayn.reada.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 权限(Permission)实体类
 *
 * @author zayn
 * @since 2025-05-05 20:49:25
 */
@Data
@TableName("permission")
public class Permission {
    /**
     * 权限ID
     */
    @TableId("perm_id")
    private Long permId;
    
    /**
     * 权限代码
     */
    @TableField("perm_code")
    private String permCode;
    
    /**
     * 权限描述
     */
    @TableField("description")
    private String description;
    
}


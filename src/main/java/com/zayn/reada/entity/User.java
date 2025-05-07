package com.zayn.reada.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 用户(User)实体类
 *
 * @author zayn
 * @since 2025-05-05 20:40:55
 */
@Data
@TableName("user")
public class User {
    /**
     * 用户ID
     */
    @TableId("user_id")
    private Long userId;
    
    /**
     * 更新时间
     */
    @TableField("updated_at")
    private Date updatedAt;
    
    /**
     * 用户状态，1:正常，2:禁用，3:删除
     */
    @TableField("status")
    private Integer status;
    
}


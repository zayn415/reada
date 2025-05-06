package com.zayn.reada.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zayn.reada.entity.Permission;
import org.apache.ibatis.annotations.Mapper;

/**
 * 权限(Permission)表Mapper
 *
 * @author zayn
 * @since 2025-05-05 20:49:25
 */
@Mapper
public interface PermissionMapper extends BaseMapper<Permission> {
}

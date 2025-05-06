package com.zayn.reada.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zayn.reada.entity.Role;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色(Role)表Mapper
 *
 * @author zayn
 * @since 2025-05-05 20:49:25
 */
@Mapper
public interface RoleMapper extends BaseMapper<Role> {
}

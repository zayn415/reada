package com.zayn.reada.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zayn.reada.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户-角色(UserRole)表Mapper
 *
 * @author zayn
 * @since 2025-05-05 20:49:26
 */
@Mapper
public interface UserRoleMapper extends BaseMapper<UserRole> {
}

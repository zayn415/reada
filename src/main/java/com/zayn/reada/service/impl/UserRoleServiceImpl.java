package com.zayn.reada.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zayn.reada.entity.UserRole;
import com.zayn.reada.mapper.UserRoleMapper;
import com.zayn.reada.service.UserRoleService;
import org.springframework.stereotype.Service;

/**
 * 用户-角色(UserRole)表服务实现类
 *
 * @author zayn
 * @since 2025-05-05 20:49:26
 */
@Service("userRoleService")
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {
    
}

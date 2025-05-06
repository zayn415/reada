package com.zayn.reada.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zayn.reada.entity.RolePermission;
import com.zayn.reada.mapper.RolePermissionMapper;
import com.zayn.reada.service.RolePermissionService;
import org.springframework.stereotype.Service;

/**
 * 角色-权限(RolePermission)表服务实现类
 *
 * @author zayn
 * @since 2025-05-05 20:49:25
 */
@Service("rolePermissionService")
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermission> implements RolePermissionService {
    
}

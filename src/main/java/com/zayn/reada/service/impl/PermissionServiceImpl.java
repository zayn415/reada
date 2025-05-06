package com.zayn.reada.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zayn.reada.entity.Permission;
import com.zayn.reada.mapper.PermissionMapper;
import com.zayn.reada.service.PermissionService;
import org.springframework.stereotype.Service;

/**
 * 权限(Permission)表服务实现类
 *
 * @author zayn
 * @since 2025-05-05 20:49:25
 */
@Service("permissionService")
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {
    
}

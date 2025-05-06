package com.zayn.reada.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zayn.reada.entity.Role;
import com.zayn.reada.mapper.RoleMapper;
import com.zayn.reada.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * 角色(Role)表服务实现类
 *
 * @author zayn
 * @since 2025-05-05 20:49:25
 */
@Service("roleService")
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {
    
}

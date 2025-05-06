package com.zayn.reada.controller;

import com.zayn.reada.service.RolePermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 角色-权限(RolePermission)表控制层
 *
 * @author zayn
 * @since 2025-05-05 20:49:25
 */
@RestController
@RequestMapping("rolePermission")
@RequiredArgsConstructor
public class RolePermissionController {
    
    private final RolePermissionService rolePermissionService;
    
}


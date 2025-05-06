package com.zayn.reada.controller;

import com.zayn.reada.service.PermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 权限(Permission)表控制层
 *
 * @author zayn
 * @since 2025-05-05 20:49:25
 */
@RestController
@RequestMapping("permission")
@RequiredArgsConstructor
public class PermissionController {
    
    private final PermissionService permissionService;
    
}


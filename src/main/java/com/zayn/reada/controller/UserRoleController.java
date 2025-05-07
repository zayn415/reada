package com.zayn.reada.controller;

import com.zayn.reada.service.UserRoleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 用户-角色(UserRole)表控制层
 *
 * @author zayn
 * @since 2025-05-05 20:49:25
 */
@RestController
@RequestMapping("/userRole")
@AllArgsConstructor
public class UserRoleController {
    
    private final UserRoleService userRoleService;
    
}


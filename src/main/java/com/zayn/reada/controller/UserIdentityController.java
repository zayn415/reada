package com.zayn.reada.controller;

import com.zayn.reada.service.UserIdentityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 用户身份(UserIdentity)表控制层
 *
 * @author zayn
 * @since 2025-05-05 20:48:24
 */
@RestController
@RequestMapping("/userIdentity")
@RequiredArgsConstructor
public class UserIdentityController {
    
    private final UserIdentityService userIdentityService;
    
}


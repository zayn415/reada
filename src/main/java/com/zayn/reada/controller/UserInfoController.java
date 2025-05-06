package com.zayn.reada.controller;

import com.zayn.reada.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 用户信息(UserInfo)表控制层
 *
 * @author zayn
 * @since 2025-05-05 20:44:21
 */
@RestController
@RequestMapping("userInfo")
@RequiredArgsConstructor
public class UserInfoController {
    
    private final UserInfoService userInfoService;
    
}


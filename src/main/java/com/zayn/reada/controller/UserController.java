package com.zayn.reada.controller;

import com.zayn.reada.model.common.Result;
import com.zayn.reada.model.request.LoginCodeRequest;
import com.zayn.reada.model.request.PhoneLoginRequest;
import com.zayn.reada.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户(User)表控制层
 *
 * @author zayn
 * @since 2025-05-05 20:40:54
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    
    private final UserService userService;
    
    /**
     * 获取验证码
     */
    @PostMapping("/login/code")
    public Result getLoginCode(@Valid @RequestBody LoginCodeRequest req) {
        return userService.getLoginCode(req);
    }
    
    /**
     * 手机号登录；未注册则先注册
     */
    @PostMapping("/login/phone")
    public Result phoneLogin(@Valid @RequestBody PhoneLoginRequest req) {
        return userService.phoneLogin(req);
    }
}


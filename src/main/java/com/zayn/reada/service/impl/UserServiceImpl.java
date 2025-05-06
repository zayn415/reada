package com.zayn.reada.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zayn.reada.common.Result;
import com.zayn.reada.entity.User;
import com.zayn.reada.mapper.UserMapper;
import com.zayn.reada.model.request.PhoneLoginRequest;
import com.zayn.reada.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户(User)表服务实现类
 *
 * @author zayn
 * @since 2025-05-05 20:40:56
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    
    /**
     * 手机号登录；未注册则先注册
     */
    @Override
    public Result phoneLogin(PhoneLoginRequest req) {
        return null;
    }
}

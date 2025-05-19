package com.zayn.reada.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zayn.reada.entity.User;
import com.zayn.reada.model.common.Result;
import com.zayn.reada.model.request.LoginCodeRequest;
import com.zayn.reada.model.request.LoginRequest;
import jakarta.validation.Valid;

/**
 * 用户(User)表服务接口
 *
 * @author zayn
 * @since 2025-05-05 20:40:55
 */
public interface UserService extends IService<User> {
    
    Result login(@Valid LoginRequest req);
    
    Result getLoginCode(@Valid LoginCodeRequest req);
}

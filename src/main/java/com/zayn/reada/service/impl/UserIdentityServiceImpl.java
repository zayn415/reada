package com.zayn.reada.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zayn.reada.entity.UserIdentity;
import com.zayn.reada.mapper.UserIdentityMapper;
import com.zayn.reada.service.UserIdentityService;
import org.springframework.stereotype.Service;

/**
 * 用户身份(UserIdentity)表服务实现类
 *
 * @author zayn
 * @since 2025-05-11 23:28:29
 */
@Service("userIdentityService")
public class UserIdentityServiceImpl extends ServiceImpl<UserIdentityMapper, UserIdentity> implements UserIdentityService {
    
}

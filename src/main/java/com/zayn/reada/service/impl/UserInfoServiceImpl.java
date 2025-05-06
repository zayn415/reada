package com.zayn.reada.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zayn.reada.entity.UserInfo;
import com.zayn.reada.mapper.UserInfoMapper;
import com.zayn.reada.service.UserInfoService;
import org.springframework.stereotype.Service;

/**
 * 用户信息(UserInfo)表服务实现类
 *
 * @author zayn
 * @since 2025-05-05 20:44:21
 */
@Service("userInfoService")
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {
    
}

package com.zayn.reada.service.impl;

import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zayn.reada.entity.User;
import com.zayn.reada.entity.UserInfo;
import com.zayn.reada.mapper.UserInfoMapper;
import com.zayn.reada.mapper.UserMapper;
import com.zayn.reada.model.common.RedisPrefix;
import com.zayn.reada.model.common.Result;
import com.zayn.reada.model.request.LoginCodeRequest;
import com.zayn.reada.model.request.PhoneLoginRequest;
import com.zayn.reada.model.response.LoginUserResponse;
import com.zayn.reada.service.UserService;
import com.zayn.reada.utils.GenerateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

/**
 * 用户(User)表服务实现类
 *
 * @author zayn
 * @since 2025-05-05 20:40:56
 */
@Slf4j
@Service("userService")
@RequiredArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    
    private final StringRedisTemplate stringRedisTemplate;
    private final UserInfoMapper userInfoMapper;
    
    /**
     * 获取登录验证码
     */
    @Override
    public Result getLoginCode(LoginCodeRequest req) {
        // 生成验证码
        String code = GenerateUtil.generatePhoneCode();
        // 保存到Redis
        stringRedisTemplate.opsForValue()
                           .set(RedisPrefix.LOGIN_CODE.getPrefix() + req.getPhone(), code, 5, TimeUnit.MINUTES);
        // todo 发送
        
        log.info("手机号：{}，验证码：{}", req.getPhone(), code);
        return Result.success("发送成功");
    }
    
    /**
     * 手机号登录；未注册则先注册
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result phoneLogin(PhoneLoginRequest req) {
        // 校验验证码
        String code = stringRedisTemplate.opsForValue().get(RedisPrefix.LOGIN_CODE.getPrefix() + req.getPhone());
        if (code == null || !code.equals(req.getCode())) {
            return Result.error("验证码错误");
        }
        
        // 查询用户
        User user = this.getOne(new LambdaQueryWrapper<User>().eq(User::getPhone, req.getPhone()));
        UserInfo userInfo;
        // 不存在，则注册
        if (user == null) {
            user = new User();
            user.setPhone(req.getPhone());
            this.save(user);
            
            // 用户信息
            userInfo = new UserInfo();
            userInfo.setUserId(user.getUserId());
            userInfo.setNickname(GenerateUtil.generateUsername());
            userInfoMapper.insert(userInfo);
        } else {
            userInfo
                    = userInfoMapper.selectOne(new LambdaQueryWrapper<UserInfo>().eq(UserInfo::getUserId, user.getUserId()));
        }
        // 登录
        StpUtil.login(req.getPhone());
        LoginUserResponse loginUserResponse = new LoginUserResponse();
        BeanUtil.copyProperties(user, loginUserResponse);
        BeanUtil.copyProperties(userInfo, loginUserResponse);
        
        return Result.success(loginUserResponse);
    }
}
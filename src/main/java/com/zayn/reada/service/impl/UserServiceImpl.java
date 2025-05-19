package com.zayn.reada.service.impl;

import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zayn.reada.entity.User;
import com.zayn.reada.entity.UserIdentity;
import com.zayn.reada.entity.UserInfo;
import com.zayn.reada.mapper.UserIdentityMapper;
import com.zayn.reada.mapper.UserInfoMapper;
import com.zayn.reada.mapper.UserMapper;
import com.zayn.reada.model.common.LoginType;
import com.zayn.reada.model.common.RedisPrefix;
import com.zayn.reada.model.common.Result;
import com.zayn.reada.model.request.LoginCodeRequest;
import com.zayn.reada.model.request.LoginRequest;
import com.zayn.reada.model.response.LoginUserResponse;
import com.zayn.reada.service.UserService;
import com.zayn.reada.utils.EmailUtil;
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
    private final UserIdentityMapper userIdentityMapper;
    private final EmailUtil emailUtil;
    
    /**
     * 获取登录验证码
     */
    @Override
    public Result getLoginCode(LoginCodeRequest req) {
        // 生成验证码
        String code = GenerateUtil.generatePhoneCode();
        if (req.getLoginType().equals(LoginType.PHONE.getType())) {
            // todo 发送手机验证码
            
            log.info("手机号：{}，验证码：{}", req.getAccount(), code);
        } else if (req.getLoginType().equals(LoginType.EMAIL.getType())) {
            // todo 发送邮箱验证码
            log.info("邮箱：{}，验证码：{}", req.getAccount(), code);
            Boolean b = emailUtil.sendEmailCode(req.getAccount(), code);
            if (b) {
                return Result.success("发送成功");
            } else {
                return Result.error("发送失败，请稍后重试");
            }
        }
        stringRedisTemplate.opsForValue()
                           .set(RedisPrefix.LOGIN_CODE.getPrefix() + req.getAccount(), code, 5, TimeUnit.MINUTES);
        
        return Result.success("发送成功");
    }
    
    /**
     * 手机号登录；未注册则先注册
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result login(LoginRequest req) {
        // 校验验证码
        String code = stringRedisTemplate.opsForValue().get(RedisPrefix.LOGIN_CODE.getPrefix() + req.getAccount());
        if (code == null || !code.equals(req.getCode())) {
            return Result.error("验证码错误");
        }
        
        // 查询用户
        String loginType = req.getLoginType();
        UserIdentity userIdentity
                = userIdentityMapper.selectOne(new LambdaQueryWrapper<UserIdentity>().eq(UserIdentity::getIdentityType, loginType)
                                                                                     .eq(UserIdentity::getIdentityValue, req.getAccount()));
        User user;
        UserInfo userInfo;
        // 不存在，则注册
        if (userIdentity == null) {
            user = new User();
            this.save(user);
            
            // 用户身份
            userIdentity = new UserIdentity();
            userIdentity.setUserId(user.getUserId());
            userIdentity.setIdentityType(loginType);
            userIdentity.setIdentityValue(req.getAccount());
            userIdentityMapper.insert(userIdentity);
            
            // 用户信息
            userInfo = new UserInfo();
            userInfo.setUserId(user.getUserId());
            userInfo.setNickname(GenerateUtil.generateUsername());
            userInfoMapper.insert(userInfo);
        } else {
            user = this.getById(userIdentity.getUserId());
            userInfo
                    = userInfoMapper.selectOne(new LambdaQueryWrapper<UserInfo>().eq(UserInfo::getUserId, user.getUserId()));
        }
        // 登录
        StpUtil.login(user.getUserId());
        LoginUserResponse loginUserResponse = new LoginUserResponse();
        loginUserResponse.setUserId(user.getUserId());
        // todo 用户信息
        
        return Result.success(loginUserResponse);
    }
}
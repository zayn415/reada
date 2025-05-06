package com.zayn.reada.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zayn.reada.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户信息(UserInfo)表Mapper
 *
 * @author zayn
 * @since 2025-05-05 20:48:55
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {
}

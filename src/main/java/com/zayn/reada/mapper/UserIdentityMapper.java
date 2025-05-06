package com.zayn.reada.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zayn.reada.entity.UserIdentity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户身份(UserIdentity)表Mapper
 *
 * @author zayn
 * @since 2025-05-05 20:48:27
 */
@Mapper
public interface UserIdentityMapper extends BaseMapper<UserIdentity> {
}

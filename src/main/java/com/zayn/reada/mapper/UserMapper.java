package com.zayn.reada.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zayn.reada.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zayn
 * @since 2025/5/5
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}

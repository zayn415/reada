package com.zayn.reada.model.common;

import lombok.Getter;

/**
 * Redis前缀枚举类
 *
 * @author zayn
 * @since 2025/5/7
 */
@Getter
public enum RedisPrefix {
    
    LOGIN_CODE("login:code:"),
    ;
    
    private final String prefix;
    
    RedisPrefix(String prefix) {
        this.prefix = prefix;
    }
}

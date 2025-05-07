package com.zayn.reada.model.common;

import lombok.Getter;

/**
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

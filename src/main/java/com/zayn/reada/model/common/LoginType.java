package com.zayn.reada.model.common;

import lombok.Getter;

/**
 * 登录类型
 *
 * @author zayn
 * @since 2025/5/12
 */
@Getter
public enum LoginType {
    PHONE("phone"),
    EMAIL("email"),
    ;
    
    private final String type;
    
    LoginType(String type) {
        this.type = type;
    }
}

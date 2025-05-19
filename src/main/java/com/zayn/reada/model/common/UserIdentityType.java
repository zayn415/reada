package com.zayn.reada.model.common;

import lombok.Getter;

/**
 * 用户身份类型枚举类
 *
 * @author zayn
 * @since 2025/5/11
 */
@Getter
public enum UserIdentityType {
    WECHAT("wechat"),
    QQ("qq"),
    WEIBO("weibo"),
    PHONE("phone"),
    EMAIL("email"),
    ;
    
    private final String type;
    
    UserIdentityType(String type) {
        this.type = type;
    }
}

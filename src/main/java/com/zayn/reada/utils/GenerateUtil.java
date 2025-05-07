package com.zayn.reada.utils;

import lombok.extern.slf4j.Slf4j;

/**
 * 生成工具类
 *
 * @author zayn
 * @since 2025/5/5
 */
@Slf4j
public class GenerateUtil {
    
    /**
     * 生成6位验证码
     */
    public static String generatePhoneCode() {
        return String.valueOf((int) ((Math.random() * 9 + 1) * 100000));
    }
    
    /**
     * 生成初始用户名
     * 10位大小写字母
     */
    public static String generateUsername() {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(chars.charAt((int) (Math.random() * chars.length())));
        }
        return sb.toString();
    }
}

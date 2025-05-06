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
    
}

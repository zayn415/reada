package com.zayn.reada.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

/**
 * 手机号登录注册请求体
 *
 * @author zayn
 * @since 2025/5/5
 */
@Data
public class PhoneLoginRequest {
    
    @NotBlank
    @Pattern(regexp = "^1[3-9]\\d{9}$", message = "手机号格式不正确")
    private String phone;
    
    @NotBlank
    private String password;
}

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
public class LoginRequest {
    
    @NotBlank
    private String loginType;
    
    @NotBlank
    private String account;
    
    @NotBlank
    @Pattern(regexp = "^\\d{6}$", message = "验证码格式错误")
    private String code;
}

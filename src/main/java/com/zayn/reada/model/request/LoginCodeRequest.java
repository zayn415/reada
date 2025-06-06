package com.zayn.reada.model.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * 获取验证码请求体
 *
 * @author zayn
 * @since 2025/5/5
 */
@Data
public class LoginCodeRequest {
    
    @NotBlank
    private String loginType;
    
    @NotBlank
    private String account;
}

package com.zayn.reada.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一响应结果
 *
 * @author zayn
 * @since 2025/5/5
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private Integer code;
    private String message;
    private Object data;
    
    public static Result success() {
        return new Result(200, "成功", null);
    }
    
    public static Result success(Object data) {
        return new Result(200, "成功", data);
    }
    
    public static Result error(String message) {
        return new Result(500, message, null);
    }
}

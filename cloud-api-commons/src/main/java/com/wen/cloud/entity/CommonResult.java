package com.wen.cloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 7wen
 * @Date: 2023-03-01 18:58
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T>{

    private Integer code;
    private String msg;
    private T data;

    public CommonResult(Integer code, String msg) {
        this(code, msg, null);
    }
}

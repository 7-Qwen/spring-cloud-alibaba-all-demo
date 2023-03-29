package com.wen.cloud.config;

/**
 * @author: 7wen
 * @Date: 2023-03-28 21:07
 * @description:
 */
public class CustomerFallBackException {
    public static String testDBFallBack(Integer id,Throwable throwable) {
        return "出现了异常fallback..";
    }
}

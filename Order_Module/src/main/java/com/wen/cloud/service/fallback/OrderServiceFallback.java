package com.wen.cloud.service.fallback;

import com.wen.cloud.entity.CommonResult;
import org.springframework.stereotype.Component;

/**
 * @author: 7wen
 * @Date: 2023-03-29 13:47
 * @description:
 */
@Component
public class OrderServiceFallback {
    public static CommonResult exceptionComponent(Exception e) {
        return new CommonResult(444, "订单微服务出现问题,请查看日志:" + e);
    }
}

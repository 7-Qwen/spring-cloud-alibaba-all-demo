package com.wen.cloud.fallback;

import com.wen.cloud.service.ConsumerFeignHystrixService;
import org.springframework.stereotype.Component;

/**
 * @author: 7wen
 * @Date: 2023-03-21 21:05
 * @description:
 */
@Component
public class ConsumerFeignHystrixServiceFallbackImpl implements ConsumerFeignHystrixService {
    @Override
    public String getOk(String msg) {
        return "页面出错啦,请稍后重试";
    }

    @Override
    public String getNo(String msg) {
        return "页面出错啦请稍后重试";
    }

    @Override
    public String getSn(String msg) {
        return "页面出错啦请稍后重试";
    }
}

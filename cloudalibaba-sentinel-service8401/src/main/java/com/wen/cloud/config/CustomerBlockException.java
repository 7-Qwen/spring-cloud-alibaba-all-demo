package com.wen.cloud.config;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author: 7wen
 * @Date: 2023-03-28 21:06
 * @description:
 */
public class CustomerBlockException {
    @Value("${server.port}")
    private static String port;

    public static String testDBlock(Integer id,BlockException blockException) {
        return "出现了熔断降级,请检查服务,端口为:" + port;
    }
}

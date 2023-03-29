package com.wen.cloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wen.cloud.config.CustomerBlockException;
import com.wen.cloud.config.CustomerFallBackException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author: 7wen
 * @Date: 2023-03-28 17:42
 * @description:
 */
@RestController
@RequestMapping(value = "/sentinel")
@Slf4j
public class SentinelController {
    @GetMapping(value = "/testA")
    public String getA() {
        return "this is testA....";
    }

    @GetMapping(value = "/testB")
    public String getB() {
        log.info("----" + Thread.currentThread().getName() + "----");
        return Thread.currentThread().getName() + ",this is testB.....";
    }

    @GetMapping("/testD/{id}")
    @SentinelResource(value = "/sentinel/testD",
            blockHandlerClass = CustomerBlockException.class, blockHandler = "testDBlock",
            fallbackClass = CustomerFallBackException.class, fallback = "testDBFallBack")
    public String testD(@PathVariable("id")Integer id) {
        //暂停几秒钟线程
//        try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
//        log.info("testD 测试RT");
        if (id == 4) {
            throw new IllegalArgumentException("IllegalArgumentException,非法参数异常....");
        }
        return "------testD";
    }

    @GetMapping(value = "/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "blockException")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1, @RequestParam(value = "p2", required = false) String p2) {
        return p1 + "--->" + p2;
    }

    public String blockException(String p1, String p2, BlockException be) {
        return "您请求的api被限流,请查看异常日志";
    }
}

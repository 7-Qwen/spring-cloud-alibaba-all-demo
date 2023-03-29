package com.wen.cloud.controller;

import com.wen.cloud.entity.CommonResult;
import com.wen.cloud.service.StorageService;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: 7wen
 * @Date: 2023-03-29 13:08
 * @description:
 */
@RefreshScope
@RestController
@RequestMapping(value = "/storage")
public class StorageController {
    @Resource
    private StorageService storageService;

    @PostMapping(value = "/update")
    public CommonResult updateStorage(@RequestParam("productId") Long productId, @RequestParam("count") Integer count) {
//        try {
//            Thread.sleep(TimeUnit.SECONDS.toMillis(5));
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        int i = 1 / 0;
        Boolean result = storageService.updateStorage(productId, count);
        return result ? new CommonResult(200, "更新成功") : new CommonResult(444, "更新失败");
    }

}

package com.wen.cloud.service;

import com.wen.cloud.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: 7wen
 * @Date: 2023-03-29 12:53
 * @description:
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {
    @PostMapping("/storage/update")
    CommonResult updateStorage(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}

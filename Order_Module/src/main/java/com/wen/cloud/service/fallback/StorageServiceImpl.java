package com.wen.cloud.service.fallback;

import com.wen.cloud.entity.CommonResult;
import com.wen.cloud.service.StorageService;
import org.springframework.stereotype.Component;

/**
 * @author: 7wen
 * @Date: 2023-03-29 12:56
 * @description:
 */
@Component
public class StorageServiceImpl implements StorageService {
    @Override
    public CommonResult updateStorage(Long productId, Integer count) {
        return new CommonResult(444, "库存微服务出现错误,请查看出错日志");
    }
}

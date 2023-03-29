package com.wen.cloud.service;

/**
 * @author: 7wen
 * @Date: 2023-03-29 13:10
 * @description:
 */
public interface StorageService {

    /**
     * 更新库存
     */
    Boolean updateStorage(Long productId, Integer count);
}

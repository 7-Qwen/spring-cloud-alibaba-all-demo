package com.wen.cloud.service.serviceImpl;

import com.wen.cloud.dao.StorageMapper;
import com.wen.cloud.service.StorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: 7wen
 * @Date: 2023-03-29 13:11
 * @description:
 */
@Service
public class StorageServiceImpl implements StorageService {
    @Resource
    private StorageMapper storageMapper;

    @Override
    public Boolean updateStorage(Long productId, Integer count) {
        return storageMapper.updateStorage(productId, count);
    }
}

package com.wen.cloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: 7wen
 * @Date: 2023-03-29 10:20
 * @description:
 */
@Mapper
public interface StorageMapper {

    /**
     * 更新库存
     */
    Boolean updateStorage(@Param("productId") Long productId, @Param("count") Integer count);
}

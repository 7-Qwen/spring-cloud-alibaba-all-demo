package com.wen.cloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author: 7wen
 * @Date: 2023-03-29 10:20
 * @description:
 */
@Mapper
public interface AccountMapper {

    /**
     * 更新账号余额
     */
    Boolean updateAccountMoney(@Param("userId") Long userId, @Param("money") BigDecimal money);
}

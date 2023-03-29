package com.wen.cloud.service.serviceImpl;

import com.wen.cloud.dao.AccountMapper;
import com.wen.cloud.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author: 7wen
 * @Date: 2023-03-29 13:21
 * @description:
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountMapper accountMapper;

    @Override
    public Boolean updateAccountMoney(Long userId, BigDecimal money) {
        return accountMapper.updateAccountMoney(userId, money);
    }
}

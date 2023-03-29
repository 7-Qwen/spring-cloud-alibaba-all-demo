package com.wen.cloud.lb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: 7wen
 * @Date: 2023-03-20 20:05
 * @description:
 */
@Component
@Slf4j
public class LoadBalancerImpl implements LoadBalancer {

    /**
     * 初始化重试次数
     *
     * @author 7wen
     * @date 2023-03-20 20:12
     */
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    private final int atomicTryTimes() {
        int current;
        int next;
        //完成请求次数的更替
        do {
            current = this.atomicInteger.get();
            next = current >= Integer.MAX_VALUE ? 0 : current + 1;
        } while (!this.atomicInteger.compareAndSet(current, next));
        log.info("atomicInteger ======"+atomicInteger.get());
        return next;
    }

    @Override
    public ServiceInstance getServiceInstance(List<ServiceInstance> serviceInstances) {
        //轮询计算负载均衡公式: 实例下标 = 当前总请求次数 % 实例总数
        return serviceInstances.get(atomicTryTimes() % serviceInstances.size());
    }
}

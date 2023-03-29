package com.wen.cloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author: 7wen
 * @Date: 2023-03-20 20:04
 * @description:
 */
public interface LoadBalancer {
    ServiceInstance getServiceInstance(List<ServiceInstance> serviceInstances);
}

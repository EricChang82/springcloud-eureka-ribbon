package com.example.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


/**
 * @author changle 
 * Create Time: 2019年4月17日 
 * Purpose: 实例化RestTemplate对象到容器，供 controller使用
 */ 
@Configuration
public class EurekaRibbonConfig {
 
    @Bean // 初始化RestTemplate Bean
    @LoadBalanced // 实现负载均衡(以rest方式以别名方式进行服务调用，依赖ribbon的负载均衡@LoadBalanced)
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
 
}
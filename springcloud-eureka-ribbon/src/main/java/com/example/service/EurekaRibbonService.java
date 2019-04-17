package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EurekaRibbonService {
    @Autowired
    RestTemplate restTemplate; //springBoot web提供的.底层是httpclient。 默认整合了Ribbon，实现本地的负载均衡

    public String getInfo() {
        String message;
        try {

            //两种方式调用，一种是固定地址，一种是别名(使用别名到注册中心获取服务调用地址)

            //方式1--别名
            message = restTemplate.getForObject("http://EUREKA-CLIENT/info", String.class);
            //方式1--固定地址(不正确的方式)
//            message = restTemplate.getForObject("http://127.0.0.1/info", String.class);
            //            System.out.println("服务 EUREKA-CLIENT/info 返回信息 : " + message);
            //            System.out.println("调用 服务 EUREKA-CLIENT/info 成功！");
        } catch (Exception ex) {
            message = ex.getMessage();
        }
        return message;
    }
}
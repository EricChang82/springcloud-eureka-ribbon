package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient // 启用 Eureka 服务发现 相关配置
@SpringBootApplication
public class SpringcloudEurekaRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaRibbonApplication.class, args);
	}

}

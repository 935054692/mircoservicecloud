package com.weiy.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //服务发现
@EnableCircuitBreaker //开启对熔断器的支持
@MapperScan("com.weiy.springcloud.dao")
public class Dept_Hystrix_8001App {

	public static void main(String[] args) {
		SpringApplication.run(Dept_Hystrix_8001App.class, args);
	}

}

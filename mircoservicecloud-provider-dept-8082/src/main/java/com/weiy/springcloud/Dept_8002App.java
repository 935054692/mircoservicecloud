package com.weiy.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //服务发现
@MapperScan("com.weiy.springcloud.dao")
public class Dept_8002App {

	public static void main(String[] args) {
		SpringApplication.run(Dept_8002App.class, args);
	}

}

package com.weiy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages={"com.weiy.springcloud"})
@ComponentScan("com.weiy.springcloud")
public class ConsumerFeignApp_80 {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerFeignApp_80.class, args);
	}
}

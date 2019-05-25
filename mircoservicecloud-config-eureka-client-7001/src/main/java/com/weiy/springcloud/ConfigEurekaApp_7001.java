package com.weiy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ConfigEurekaApp_7001 {

	public static void main(String[] args) {
		SpringApplication.run(ConfigEurekaApp_7001.class, args);
	}

}

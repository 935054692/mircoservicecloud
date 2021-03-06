package com.weiy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApp_7003 {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApp_7003.class, args);
	}

}

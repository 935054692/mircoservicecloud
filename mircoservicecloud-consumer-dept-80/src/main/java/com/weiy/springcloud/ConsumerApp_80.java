package com.weiy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.weiy.myrule.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="MIRCOSERVICECLOUD-DEPT",configuration=MySelfRule.class)
public class ConsumerApp_80 {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApp_80.class, args);
	}
}

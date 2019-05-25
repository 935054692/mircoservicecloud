package com.weiy.springcloud.configbean;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
@EnableEurekaClient
public class ConfigBean {

	@Bean
	@LoadBalanced //开启负载均衡
	public RestTemplate resttemplate() {
		return new RestTemplate();
	}

	@Bean
	public IRule rule(){
		return new RandomRule();//达到目的，会用选择的方式代替默认的轮询算法
	}
}

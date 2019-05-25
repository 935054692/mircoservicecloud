package com.weiy.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class MySelfRule {
	
	@Bean
	public IRule myrule(){
		
		return new RoundRobinRule(); //自定义负载均衡规则
	}

}

package com.weiy.springcloud.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.weiy.springcloud.entity.Dept;

@RestController
public class ConsumerRest {
	//private static final String REST_URL_PREFIX = "http://localhost:8081";
	private static final String REST_URL_PREFIX = "http://MIRCOSERVICECLOUD-DEPT";

	@Autowired
	private RestTemplate resttemplate;

	@PostMapping("/consumer/add")
	public boolean add(Dept dept) {
		return resttemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
	}

	@GetMapping("/consumer/list")
	public List<Dept> list() {
		return resttemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
	}
	
	@GetMapping("/consumer/get/{deptno}")
	public Dept get(@RequestBody Long deptno) {
		return resttemplate.getForObject(REST_URL_PREFIX + "/dept/get/"+deptno, Dept.class);
	}
	
	@GetMapping("/consumer/client/list")
	public Object client() {
		return resttemplate.getForObject(REST_URL_PREFIX + "/client/list", Object.class);
	}
}

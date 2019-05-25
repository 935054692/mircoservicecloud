package com.weiy.springcloud.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.weiy.springcloud.entity.Dept;
import com.weiy.springcloud.service.DeptClientService;

@RestController
public class ConsumerRest {
	
	@Autowired
	private DeptClientService deptclient;
	
	@GetMapping("/dept/add")
	public boolean add(Dept dept) {
		return this.deptclient.add(dept);
	}

	@GetMapping("/dept/list")
	public List<Dept> list() {
		return this.deptclient.list();
	}
	
	@GetMapping("/dept/get/{deptno}")
	public Dept get(@PathVariable("deptno") Long deptno) {
		return this.deptclient.get(deptno);
	}
	
	@GetMapping("/client/list")
	public Object client() {
		return this.deptclient.client();
	}
	
}

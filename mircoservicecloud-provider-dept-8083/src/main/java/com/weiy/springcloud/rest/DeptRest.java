package com.weiy.springcloud.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.weiy.springcloud.entity.Dept;
import com.weiy.springcloud.service.DeptService;

@RestController
public class DeptRest {

	@Autowired
	private DeptService deptservice;
	
	@Autowired
	private DiscoveryClient client;
	

	@PostMapping("/dept/add")
	public boolean addDept(@RequestBody Dept dept) {
		return deptservice.addDept(dept);
	}

	@GetMapping("/dept/get/{deptno}")
	public Dept findById(@PathVariable Long deptno) {
		return deptservice.findById(deptno);
	}

	@GetMapping("/dept/list")
	public List<Dept> list() {
		return deptservice.findAll();
	}

	@GetMapping("/client/list")
	public Object clientlist() {
		List<String> services = client.getServices();
		System.out.println(services+"-----");
		List<ServiceInstance> instances = client.getInstances("MIRCOSERVICECLOUD-DEPT");
		for (ServiceInstance serviceInstance : instances) {
			System.out.println(serviceInstance.getServiceId()+"--"+serviceInstance.getHost()+"--"+serviceInstance.getPort()
			+"--"+serviceInstance.getUri()+"--"+serviceInstance.getMetadata()+"--"+serviceInstance.getClass());
		}
		return this.client;
	}
	
}

package com.weiy.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.weiy.springcloud.entity.Dept;

/**
 * 新建一个实现了fallbackfactory接口的类DeptClientServiceFallBackFactory
 * @author weiyang
 *
 */
@FeignClient(value = "MIRCOSERVICECLOUD-DEPT",fallbackFactory=DeptClientServiceFallBackFactory.class)
public interface DeptClientService {

	@GetMapping("/dept/add")
	public boolean add(Dept dept);

	@GetMapping("/dept/list")
	public List<Dept> list();

	@GetMapping("/dept/get/{deptno}")
	public Dept get(@PathVariable("deptno") Long deptno);

	@GetMapping("/client/list")
	public Object client();
}

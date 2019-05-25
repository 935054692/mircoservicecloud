package com.weiy.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.weiy.springcloud.entity.Dept;

import feign.hystrix.FallbackFactory;

/**
 * 所有的熔断机制都在这个类里面实现
 * 
 * @author weiyang
 *
 */
@Component // 一定要添加
public class DeptClientServiceFallBackFactory implements FallbackFactory<DeptClientService> {

	@Override
	public DeptClientService create(Throwable arg0) {
		return new DeptClientService() {

			@Override
			public List<Dept> list() {
				return null;
			}

			@Override
			public Dept get(Long deptno) {
				return new Dept().setDeptno(deptno)
						.setDname("该id：" + deptno + "没有对应的信息，Consumer客户端提供的降级服务，此刻provide已经停止!")
						.setDb_source("no this databse in MYSQL");
			}

			@Override
			public Object client() {
				return null;
			}

			@Override
			public boolean add(Dept dept) {
				return false;
			}
		};
	}

}

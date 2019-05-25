package com.weiy.springcloud.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.weiy.springcloud.entity.Dept;

public interface DeptService {
	
	public boolean addDept(Dept dept);
	
	public Dept findById(Long deptno);

	public List<Dept> findAll();
}

package com.weiy.springcloud.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weiy.springcloud.dao.DeptDao;
import com.weiy.springcloud.entity.Dept;
import com.weiy.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptdao;

	@Override
	public boolean addDept(Dept dept) {
		return deptdao.addDept(dept);
	}

	@Override
	public Dept findById(Long deptno) {
		return deptdao.findById(deptno);
	}

	@Override
	public List<Dept> findAll() {
		return deptdao.findAll();
	}

}

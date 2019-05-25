package com.weiy.springcloud.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable{ 

	private long deptno;
	private String dname;
	private String db_source;
	
	

	public Dept(String dname) {
		super();
		this.dname = dname;
	}

}

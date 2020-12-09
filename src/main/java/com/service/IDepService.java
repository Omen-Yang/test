package com.service;

import java.util.List;

import com.po.Dep;

public interface IDepService {
	//部门信息查询
	public List<Dep> findAll(); 
}

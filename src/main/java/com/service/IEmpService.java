package com.service;

import com.po.Emp;

import java.util.List;

import com.po.PageBean;

public interface IEmpService {
	  //员工表新增
	  public boolean save(Emp emp);
	  //员工表修改
	  public boolean update(Emp emp);
	  //删除员工信息
	  public boolean delById(Integer eid);
	  //查询单个员工信息
	  public Emp findById(Integer eid);
	  //查询员工表
	  public List<Emp> findPageAll(PageBean pb);
	  //分页查询，总记录数
	  public int findMaxRow();
}

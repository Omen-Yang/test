package com.mapper;

import java.util.List;

import org.springframework.stereotype.Service;

import com.po.PageBean;
import com.po.Emp;

@Service("EmpDAO")
public interface IEmpMapper {
	 public int save(Emp emp);
	 public int update(Emp emp);
	 public int delById(Integer eid);
	 public Emp findById(Integer eid);
	 public List<Emp> findPageAll(PageBean pb);
	 public int findMaxRow();
	 //获取Id最大值
	 public int findMaxEid();
}

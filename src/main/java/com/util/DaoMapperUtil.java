package com.util;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.IDepMapper;
import com.mapper.IEmpMapper;
import com.mapper.IEmpWelfareMapper;
import com.mapper.ISalaryMapper;
import com.mapper.IWelfareMapper;

@Service("DaoMapper")

public class DaoMapperUtil {
	@Resource(name = "DepDao")
	public IDepMapper depMapper;
	@Resource(name = "EmpDAO")
	public IEmpMapper empMapper;
	@Resource(name = "EmpWelfareDAO")
	public IEmpWelfareMapper empWelfareMapper;
	@Resource(name = "SalaryDAO")
	public ISalaryMapper salaryMapper;
	@Resource(name = "WelfareDAO")
	public IWelfareMapper welfareMapper;
	
	public IDepMapper getDepMapper() {
		return depMapper;
	}
	public void setDepMapper(IDepMapper depMapper) {
		this.depMapper = depMapper;
	}
	public IEmpMapper getEmpMapper() {
		return empMapper;
	}
	public void setEmpMapper(IEmpMapper empMapper) {
		this.empMapper = empMapper;
	}
	public IEmpWelfareMapper getEmpWelfareMapper() {
		return empWelfareMapper;
	}
	public void setEmpWelfareMapper(IEmpWelfareMapper empWelfareMapper) {
		this.empWelfareMapper = empWelfareMapper;
	}
	public ISalaryMapper getSalaryMapper() {
		return salaryMapper;
	}
	public void setSalaryMapper(ISalaryMapper salaryMapper) {
		this.salaryMapper = salaryMapper;
	}
	public IWelfareMapper getWelfareMapper() {
		return welfareMapper;
	}
	public void setWelfareMapper(IWelfareMapper welfareMapper) {
		this.welfareMapper = welfareMapper;
	}
	
}

package com.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.po.Welfare;
import com.service.IWelfareService;
import com.util.DaoMapperUtil;

@Service("WelfareService")
public class WelfareService implements IWelfareService {
	@Resource(name="DaoMapper")
	public DaoMapperUtil daoMapper;
	
	public DaoMapperUtil getDaoMapper() {
		return daoMapper;
	}

	public void setDaoMapper(DaoMapperUtil daoMapper) {
		this.daoMapper = daoMapper;
	}

	
	public List<Welfare> findAll() {
		// TODO Auto-generated method stub
		return daoMapper.getWelfareMapper().findAll();
	}

}

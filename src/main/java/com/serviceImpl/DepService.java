package com.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.po.Dep;
import com.service.IDepService;
import com.util.DaoMapperUtil;

@Service("DepService")
@Transactional
public class DepService implements IDepService {
	@Resource(name="DaoMapper")
 public DaoMapperUtil daoMapper;
	
	public DaoMapperUtil getDaoMapper() {
		return daoMapper;
	}

	public void setDaoMapper(DaoMapperUtil daoMapper) {
		this.daoMapper = daoMapper;
	}

		public List<Dep> findAll() {
		return daoMapper.getDepMapper().findAll();
	}
	
}

package com.property.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.property.bean.ServiceKind;
import com.property.dao.ServiceKindDao;
import com.property.service.ServiceKindService;

@Service
public class ServiceKindServiceImpl implements ServiceKindService {
	@Resource
	private ServiceKindDao serviceKindDao;

	@Override
	public ServiceKind selectById(int id) {

		return serviceKindDao.selectById(id);
	}

	@Override
	public List<ServiceKind> selectAll() {

		return serviceKindDao.selectAll();
	}

}

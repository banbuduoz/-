package com.property.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.property.bean.State;
import com.property.dao.StateDao;
import com.property.service.StateService;

@Service
public class StateServiceImpl implements StateService {

	@Resource
	private StateDao stateDao;
	
	@Override
	public State selectById(int id) {
		return stateDao.selectById(id);
	}

	@Override
	public List<State> selectAll() {
		return stateDao.selectAll();
	}

}

package com.property.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property.bean.Charge;
import com.property.dao.ChargeDao;
import com.property.service.ChargeService;
@Service
public class ChargeServiceImpl implements ChargeService {
	@Autowired
	private ChargeDao chargeDao;
	@Override
	public boolean add(Charge charge) {
		return chargeDao.add(charge)>0?true:false;
	}

	@Override
	public boolean delete(int id) {
		return chargeDao.delete(id)>0?true:false;
	}

	@Override
	public boolean update(Charge charge) {
		return chargeDao.update(charge)>0?true:false;
	}

	@Override
	public Charge select(int id) {
		return chargeDao.select(id);
	}

	@Override
	public List<Charge> selectAll() {
		return chargeDao.selectAll();
	}

}

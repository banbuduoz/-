package com.property.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property.bean.Carport;
import com.property.dao.CarportDao;
import com.property.service.CarportService;

@Service
public class CarportServiceImpl implements CarportService {
	@Autowired
	private CarportDao carportDao;

	@Override
	public Carport select() {
		return carportDao.select();
	}

	@Override
	public boolean update(Carport carport) {
		return carportDao.update(carport) > 0 ? true : false;
	}

}

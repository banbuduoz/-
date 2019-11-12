package com.property.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property.bean.House;
import com.property.dao.HouseDao;
import com.property.service.HouseService;
import com.property.service.RoomService;
@Service
public class HouseServiceImpl implements HouseService {
	@Autowired
	private HouseDao houseDao;
	@Autowired
	private RoomService roomService;

	@Override
	public boolean add(House house) {
		return houseDao.add(house) > 0 ? true : false;
	}

	@Override
	public boolean delete(int id) {
		roomService.deleteByHouseId(id);
		boolean flag = houseDao.delete(id) > 0 ? true : false;
		return flag;
	}

	@Override
	public boolean update(House house) {
		return houseDao.update(house) > 0 ? true : false;
	}

	@Override
	public House selectByHouseId(int id) {
		return houseDao.selectByHouseId(id);
	}

	@Override
	public List<House> selectAll() {
		return houseDao.selectAll();
	}

}

package com.property.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property.bean.Room;
import com.property.dao.RoomDao;
import com.property.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService {
	@Autowired
	private RoomDao roomDao;

	@Override
	public boolean add(Room room) {
		return roomDao.add(room) > 0 ? true : false;
	}

	@Override
	public boolean delete(int id) {
		return roomDao.delete(id) > 0 ? true : false;
	}

	@Override
	public boolean deleteByHouseId(int hid) {
		return roomDao.deleteByHouseId(hid) > 0 ? true : false;
	}

	@Override
	public boolean update(Room room) {
		return roomDao.update(room) > 0 ? true : false;
	}

	@Override
	public List<Room> selectByHouseId(int hid) {
		return roomDao.selectByHouseId(hid);
	}

	@Override
	public Room selectByUserId(int uid) {
		return roomDao.selectByUserId(uid);
	}

	@Override
	public Room selectById(int id) {
		return roomDao.selectById(id);
	}

}

package com.property.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property.bean.Car;
import com.property.bean.User;
import com.property.dao.CarDao;
import com.property.dao.UserDao;
import com.property.service.CarService;
import com.property.vo.CarVO;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarDao carDao;

	@Resource
	private UserDao userDao;

	public void change(List<CarVO> voList, List<Car> carList) {
		for (Car car : carList) {
			User user = userDao.selectById(car.getUid());
			String uName = user.getName();
			CarVO vo = new CarVO(car.getId(), car.getCarnum(), car.getIntime(), car.getOuttime(), car.getPay(),
					car.getInfo(), car.getUid(), uName);
			voList.add(vo);
		}
	}

	@Override
	public boolean add(Car car) {
		return carDao.add(car) > 0 ? true : false;
	}

	@Override
	public boolean delete(int id) {
		return carDao.delete(id) > 0 ? true : false;
	}

	@Override
	public boolean update(Car car) {
		return carDao.update(car) > 0 ? true : false;
	}

	@Override
	public Car selectById(int id) {
		return carDao.selectById(id);
	}

	@Override
	public List<CarVO> selectAll() {
		List<CarVO> voList = new ArrayList<>();
		change(voList, carDao.selectAll());
		return voList;
	}

	@Override
	public List<CarVO> selectByUserId(int uid) {
		List<CarVO> voList = new ArrayList<>();
		change(voList, carDao.selectByUserId(uid));
		return voList;
	}

	@Override
	public List<CarVO> selectByCarnum(String carnum) {
		List<CarVO> voList = new ArrayList<>();
		change(voList, carDao.selectByCarnum(carnum));
		return voList;
	}

}

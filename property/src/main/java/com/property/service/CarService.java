package com.property.service;

import java.util.List;

import com.property.bean.Car;
import com.property.vo.CarVO;

public interface CarService {
	/**
	 * @param car
	 * @return
	 * @category 添加车辆出入记录
	 */
	public boolean add(Car car);

	/**
	 * @param id
	 * @category 根据id删除车辆出入记录
	 */
	public boolean delete(int id);

	/**
	 * @param id
	 * @category 根据id更新车辆出入记录
	 */
	public boolean update(Car car);

	/**
	 * @param id
	 * @category 查询所有车辆出入记录
	 */
	public List<CarVO> selectAll();

	/**
	 * @param id
	 * @return
	 * @category 通过id查询车辆出入记录
	 */
	public Car selectById(int id);

	/**
	 * @return
	 * @category 根据登记人id查询
	 */
	public List<CarVO> selectByUserId(int uid);

	/**
	 * @return
	 * @category 根据车牌号查询车辆出入记录
	 */
	public List<CarVO> selectByCarnum(String carnum);
}

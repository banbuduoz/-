package com.property.dao;

import java.util.List;

import com.property.bean.Car;

/**
 * @author Administrator
 * @category 车辆出入管理接口
 */
public interface CarDao {
	/**
	 * @param car
	 * @return
	 * @category 添加车辆出入记录
	 */
	public int add(Car car);

	/**
	 * @param id
	 * @category 根据id删除车辆出入记录
	 */
	public int delete(int id);

	/**
	 * @param id
	 * @category 根据id更新车辆出入记录
	 */
	public int update(Car car);

	/**
	 * @param id
	 * @category 查询所有车辆出入记录
	 */
	public List<Car> selectAll();

	/**
	 * 通过id查询车辆出入记录
	 * 
	 * @param id
	 * @return
	 */
	public Car selectById(int id);

	/**
	 * @return
	 * @category 根据登记人id查询
	 */
	public List<Car> selectByUserId(int uid);

	/**
	 * @return
	 * @category 根据车牌号查询车辆出入记录
	 */
	public List<Car> selectByCarnum(String carnum);

}

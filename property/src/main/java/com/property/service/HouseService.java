package com.property.service;

import java.util.List;

import com.property.bean.House;

public interface HouseService {
	/**
	 * @param house
	 * @return
	 * @category 添加单元楼
	 */
	public boolean add(House house);

	/**
	 * @param id
	 * @return
	 * @category 删除单元楼
	 */
	public boolean delete(int id);

	/**
	 * @param house
	 * @return
	 * @category 更新单元楼
	 */
	public boolean update(House house);

	/**
	 * @param id
	 * @return
	 * @category 查看单元楼详情
	 */
	public House selectByHouseId(int id);

	/**
	 * @return
	 * @category 查询所有单元楼
	 */
	public List<House> selectAll();
}

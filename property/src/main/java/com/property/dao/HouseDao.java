package com.property.dao;

import java.util.List;

import com.property.bean.House;

/**
 * @author CJF
 * @category 楼宇数据访问接口
 */
public interface HouseDao {
	/**
	 * @param house
	 * @return
	 * @category 添加单元楼
	 */
	public int add(House house);

	/**
	 * @param id
	 * @return
	 * @category 删除单元楼
	 */
	public int delete(int id);

	/**
	 * @param house
	 * @return
	 * @category 更新单元楼
	 */
	public int update(House house);

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

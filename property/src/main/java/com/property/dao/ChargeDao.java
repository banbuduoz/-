package com.property.dao;

import java.util.List;

import com.property.bean.Charge;

public interface ChargeDao {

	/**
	 * @param charge
	 * @return
	 * @category 添加收费标准
	 *
	 */
	public int add(Charge charge);

	/**
	 * @param id
	 * @return
	 * @category 根据id删除收费标准
	 */
	public int delete(int id);

	/**
	 * @param charge
	 * @return
	 * @category 修改收费标准
	 */
	public int update(Charge charge);

	/**
	 * @param id
	 * @return
	 * @category 根据id查询收费标准详情
	 */
	public Charge select(int id);

	/**
	 * @return
	 * @category 查询所有的收费标准
	 */
	public List<Charge> selectAll();

}

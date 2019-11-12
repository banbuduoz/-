package com.property.dao;

import java.util.List;

import com.property.bean.Pay;

public interface PayDao {
	/**
	 * @param pay
	 * @return
	 * @category 添加缴费
	 */
	public int add(Pay pay);

	/**
	 * @param id
	 * @return
	 * @category 删除缴费
	 */
	public int delete(int id);

	/**
	 * @param pay
	 * @return
	 * @category 更新缴费
	 */
	public int update(Pay pay);

	/**
	 * @return
	 * @category 根据用户id查询缴费
	 */
	public List<Pay> selectByUserId(int uid);

	/**
	 * 通过id查询缴费表
	 * 
	 * @param id
	 * @return
	 */
	public Pay selectById(int id);

	/**
	 * @return
	 * @category 查询所有缴费
	 */
	public List<Pay> selectAll();

	/**
	 * @return
	 * @category 根据缴费月份查询所有缴费
	 */
	public List<Pay> selectByPaymonth(String paymonth);
}

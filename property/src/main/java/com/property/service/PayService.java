package com.property.service;

import java.util.List;

import com.property.bean.Pay;
import com.property.vo.PayVO;

public interface PayService {
	/**
	 * @param pay
	 * @return
	 * @category 添加缴费
	 */
	public boolean add(Pay pay);

	/**
	 * @param id
	 * @return
	 * @category 删除缴费
	 */
	public boolean delete(int id);

	/**
	 * @param pay
	 * @return
	 * @category 更新缴费
	 */
	public boolean update(Pay pay);

	/**
	 * @return
	 * @category 根据用户id查询缴费
	 */
	public List<PayVO> selectByUserId(int id);

	/**
	 * @return
	 * @category 查询所有缴费
	 */
	public List<PayVO> selectAll();
	/**
	 * 通过id查询缴费表
	 * 
	 * @param id
	 * @return
	 */
	public Pay selectById(int id);

	/**
	 * @return
	 * @category 根据缴费月份查询所有缴费
	 */
	public List<PayVO> selectByPaymonth(String paymonth);
}

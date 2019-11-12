package com.property.dao;

import com.property.bean.Carport;

public interface CarportDao {
	/**
	 * @return
	 * @category 查询车位信息
	 */
	public Carport select();

	/**
	 * @param carport
	 * @return
	 * @category 修改车位信息
	 */
	public int update(Carport carport);
}

package com.property.service;

import com.property.bean.Carport;

public interface CarportService {
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
	public boolean update(Carport carport);
}

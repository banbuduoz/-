package com.property.service;

import java.util.List;

import com.property.bean.Charge;

/**
 * @author 张延龙
 * @category 收费标准业务逻辑接口
 */
public interface ChargeService {
	/**
	 * @param charge
	 * @return
	 * @category 添加收费标准
	 *
	 */
	public boolean add(Charge charge);

	/**
	 * @param id
	 * @return
	 * @category 根据id删除收费标准
	 */
	public boolean delete(int id);

	/**
	 * @param charge
	 * @return
	 * @category 修改收费标准
	 */
	public boolean update(Charge charge);

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

package com.property.dao;

import java.util.List;

import com.property.bean.State;

/**
 * @author CJF
 * @category 状态表数据访问接口
 */
public interface StateDao {
	/**
	 * 通过id查询状态信息
	 * 
	 * @param id
	 * @return
	 */
	public State selectById(int id);

	/**
	 * 查询全部状态信息
	 * 
	 * @return
	 */
	public List<State> selectAll();
}

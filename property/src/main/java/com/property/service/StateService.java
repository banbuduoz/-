package com.property.service;

import java.util.List;

import com.property.bean.State;

/**
 * @author CJF
 * @category 状态业务逻辑接口
 */
public interface StateService {
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

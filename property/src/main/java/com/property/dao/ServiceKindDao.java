package com.property.dao;

import java.util.List;

import com.property.bean.ServiceKind;

/**
 * @author CJF
 * @category 服务类型数据访问接口
 */
public interface ServiceKindDao {
	/**
	 * 通过id查询服务类型
	 * 
	 * @param id
	 * @return
	 */
	public ServiceKind selectById(int id);

	/**
	 * 查询全部服务类型
	 * 
	 * @return
	 */
	public List<ServiceKind> selectAll();
}

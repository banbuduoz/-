package com.property.service;

import java.util.List;

import com.property.bean.ServiceKind;

/**
 * @author 张延龙
 *@category 服务类型业务逻辑接口
 */
public interface ServiceKindService {
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

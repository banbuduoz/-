package com.property.dao;

import java.util.List;

import com.property.bean.Service;

/**
 * @author CJF
 * @category 服务表数据访问接口
 */
public interface ServiceDao {
	/**
	 * 通过id查询服务表
	 * 
	 * @param id
	 * @return
	 */
	public Service selectById(int id);

	/**
	 * 查询全部服务表
	 * 
	 * @return
	 */
	public List<Service> selectAll();

	/**
	 * 通过kindid查询服务表
	 * 
	 * @param kindid
	 * @return
	 */
	public List<Service> selectByKid(int kindid);

	/**
	 * 通过sid查询服务表
	 * 
	 * @param sid
	 * @return
	 */
	public List<Service> selectBySid(int sid);

	/**
	 * 通过uid查询服务表
	 * 
	 * @param uid
	 * @return
	 */
	public List<Service> selectByUid(int uid);

	/**
	 * 添加服务表
	 * 
	 * @param service
	 * @return
	 */
	public int add(Service service);

	/**
	 * 更新服务表
	 * 
	 * @param service
	 * @return
	 */
	public int update(Service service);

	/**
	 * 删除服务表
	 * 
	 * @param ids
	 * @return
	 */
	public int delete(int[] ids);
}

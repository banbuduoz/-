package com.property.service;

import java.util.List;

import com.property.bean.Service;
import com.property.vo.ServiceVO;

/**
 * @author 张延龙
 * @category 物业服务业务逻辑接口
 */
public interface ServiceService {
	/**
	 * @param id
	 * @return
	 * @category 查询
	 */
	public Service selectById(int id);

	public List<ServiceVO> selectAll();

	/**
	 * @param kindid
	 * @return
	 * @category 根据类型查询
	 */
	public List<ServiceVO> selectByKid(int kindid);

	/**
	 * @param sid
	 * @return
	 * @category 根据状态id查询
	 */
	public List<ServiceVO> selectBySid(int sid);

	/**
	 * @param uid
	 * @return
	 * @category 根据用户id查询
	 */
	public List<ServiceVO> selectByUid(int uid);
	
	/**
	 * 添加服务表
	 * 
	 * @param service
	 * @return
	 */
	public boolean add(Service service);

	/**
	 * 更新服务表
	 * 
	 * @param service
	 * @return
	 */
	public boolean update(Service service);

	/**
	 * 删除服务表
	 * 
	 * @param ids
	 * @return
	 */
	public boolean delete(int[] ids);
}

package com.property.service;

import java.util.List;

import com.property.bean.UserFamily;
import com.property.vo.UserFamilyVO;

/**
 * @author CJF
 * @category 业主家庭成员业务逻辑接口
 */
public interface UserFamilyService {

	/**
	 * 通过id查询家庭成员
	 * 
	 * @param id
	 * @return UserFamily
	 */
	public UserFamily selectById(int id);

	/**
	 * 查询全部家庭成员
	 * 
	 * @return List<UserFamily>
	 */
	public List<UserFamilyVO> selectAll();

	/**
	 * 通过uid查询全部家庭成员
	 * 
	 * @param uid
	 * @return List<UserFamily>
	 */
	public List<UserFamilyVO> selectByUid(int uid);

	/**
	 * 更新家庭成员
	 * 
	 * @param userFamily
	 * @return
	 */
	public boolean update(UserFamily userFamily);

	/**
	 * 删除家庭成员表
	 * 
	 * @param ids
	 * @return
	 */
	public boolean delete(int id);

	/**
	 * 增加家庭成员表
	 * 
	 * @param userFamily
	 * @return
	 */
	public boolean add(UserFamily userFamily);
}

package com.property.dao;

import java.util.List;

import com.property.bean.UserFamily;

/**
 * @author CJF
 * @category 业主家庭成员表数据访问接口
 */
public interface UserFamilyDao {
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
	public List<UserFamily> selectAll();

	/**
	 * 通过uid查询全部家庭成员
	 * 
	 * @param uid
	 * @return List<UserFamily>
	 */
	public List<UserFamily> selectByUid(int uid);

	/**
	 * 更新家庭成员
	 * 
	 * @param userFamily
	 * @return
	 */
	public int update(UserFamily userFamily);

	/**
	 * 删除家庭成员表
	 * 
	 * @param ids
	 * @return
	 */
	public int delete(int id);

	/**
	 * 增加家庭成员表
	 * 
	 * @param userFamily
	 * @return
	 */
	public int add(UserFamily userFamily);
}

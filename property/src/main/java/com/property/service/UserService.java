package com.property.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.property.bean.User;
import com.property.vo.UserVO;

/**
 * @author CJF
 * @category 用户业务逻辑接口
 */
public interface UserService {
	/**
	 * 通过id查询用户
	 * 
	 * @param id
	 * @return
	 */
	public User selectById(int id);

	/**
	 * 通过用户名查找
	 * 
	 * @param name
	 * @return
	 */
	public List<UserVO> selectByName2(String name);

	/**
	 * @param id
	 * @return
	 * @category 用于登录的根据登录名和密码查询
	 */
	public User selectByLoginPass(String loginname, String pass);

	/**
	 * 根据用户登录名查找
	 * 
	 * @param name
	 * @return
	 */
	public User selectByLoginName(String loginname);

	/**
	 * 通过名字模糊查询
	 * 
	 * @param name
	 * @return
	 */
	public List<UserVO> selectByName(String name);

	/**
	 * 查询除管理员外全部用户
	 * 
	 * @return
	 */
	public List<UserVO> selectAll();

	/**
	 * 通过角色id查询用户
	 * 
	 * @param roleid
	 * @return
	 */
	public List<UserVO> selectByRoId(int roleid);

	/**
	 * 通过楼号查询用户
	 * 
	 * @param houseid
	 * @return
	 */
	public List<UserVO> selectByHouseId(int houseid);

	/**
	 * 通过房间号查询用户
	 * 
	 * @param roomid
	 * @return
	 */
	public User selectByRoomId(int roomid);

	/**
	 * 更新用户信息（模糊更新）
	 * 
	 * @param user
	 * @return
	 */
	public boolean update(User user);

	/**
	 * 增加用户（loginname，pass）
	 * 
	 * @param user
	 * @return
	 */
	public boolean add(User user);

	/**
	 * 删除用户
	 * 
	 * @param ids
	 * @return
	 */
	public boolean delete(int id);
}

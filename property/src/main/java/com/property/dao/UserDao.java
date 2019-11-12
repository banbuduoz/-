package com.property.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.property.bean.User;

/**
 * @author CJF
 * @category 用户表数据访问接口
 */
@Repository
public interface UserDao {
	/**
	 * 通过id查询用户
	 * 
	 * @param id
	 * @return
	 */
	public User selectById(int id);

	/**
	 * @param id
	 * @return
	 * @category 用于登录的根据登录名和密码查询
	 */
	public User selectByLoginPass(@Param("loginname") String loginname, @Param("pass") String pass);

	/**
	 * 根据用户姓名查找
	 * 
	 * @param name
	 * @return
	 */
	public List<User> selectByName2(String name);
	
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
	public List<User> selectByName(Map<String, String> map);

	/**
	 * 查询除管理员外全部用户
	 * 
	 * @return
	 */
	public List<User> selectAll();

	/**
	 * 通过角色id查询用户
	 * 
	 * @param roleid
	 * @return
	 */
	public List<User> selectByRoId(int roleid);

	/**
	 * 通过楼号查询用户
	 * 
	 * @param houseid
	 * @return
	 */
	public List<User> selectByHouseId(int houseid);

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
	public int update(User user);

	/**
	 * 增加用户（loginname，pass）
	 * 
	 * @param user
	 * @return
	 */
	public int add(User user);

	/**
	 * 删除用户
	 * 
	 * @param ids
	 * @return
	 */
	public int delete(int id);

}

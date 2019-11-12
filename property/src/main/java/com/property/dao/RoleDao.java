package com.property.dao;

import java.util.List;

import com.property.bean.Role;

public interface RoleDao {
	/**
	 * @param role
	 * @category 添加角色
	 * @return
	 */
	public int add(Role role);

	/**
	 * @param id
	 * @return
	 * @category 删除角色
	 */
	public int delete(int id);

	/**
	 * @param role
	 * @return
	 * @category 更新角色
	 */
	public int update(Role role);

	/**
	 * @return、
	 * @category查询所有角色
	 */
	public List<Role> selectAll();

	/**
	 * @param id
	 * @return
	 * @category 根据id查询角色
	 */
	public Role selectById(int id);

}

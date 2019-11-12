package com.property.service;

import java.util.List;

import com.property.bean.Role;

/**
 * @author 张延龙
 * @category 角色业务逻辑接口
 */
public interface RoleService {
	/**
	 * @param role
	 * @category 添加角色
	 * @return
	 */
	public boolean add(Role role);

	/**
	 * @param id
	 * @return
	 * @category 删除角色
	 */
	public boolean delete(int id);

	/**
	 * @param role
	 * @return
	 * @category 更新角色
	 */
	public boolean update(Role role);

	/**
	 * @return、
	 * 
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

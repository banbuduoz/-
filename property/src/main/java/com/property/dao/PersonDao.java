package com.property.dao;

import java.util.List;

import com.property.bean.Person;

public interface PersonDao {
	/**
	 * @param person
	 * @return
	 * @category 添加人员出入管理记录
	 */
	public int add(Person person);

	/**
	 * @param ids
	 * @return
	 * @category 删除人元出入记录
	 */
	public int delete(int id);

	/**
	 * @return
	 * @category 更新人员出入记录
	 */
	public int update(Person person);

	/**
	 * @return
	 * @category 查询所有人员出入记录，按时间排序
	 */
	public List<Person> selectAll();

	/**
	 * 通过id查询人员出入记录
	 * 
	 * @param id
	 * @return
	 */
	public Person selectById(int id);

	/**
	 * @return
	 * @category 根据用户id查询出入记录，按时间排序
	 */
	public List<Person> selectByUserId(int uid);
}

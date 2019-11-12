package com.property.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.property.bean.Safety;

/**
 * @author 张延龙
 * @category 安保记录接口
 *
 */
public interface SafetyDao {
	/**
	 * @return
	 * @category 添加安保记录
	 */
	public int add(Safety safety);

	/**
	 * @param id
	 * @return
	 * @category 删除安保记录
	 */
	public int delete(int id);

	/**
	 * @return
	 * @category 更新安保记录
	 */
	public int update(Safety safety);

	/**
	 * @return
	 * @category 查询所有安保记录
	 */
	public List<Safety> selectAll();

	/**
	 * @param uid
	 * @return
	 * @category 根据物业员工id查询安保记录
	 */
	public List<Safety> selectByUserId(int uid);

	/**
	 * @return
	 * @category 根据安保类型查询
	 */
	public List<Safety> selectByBySafekid(int kid);

}

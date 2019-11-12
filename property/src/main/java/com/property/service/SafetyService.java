package com.property.service;

import java.util.List;

import com.property.bean.Safety;
import com.property.vo.SafetyVO;

public interface SafetyService {
	/**
	 * @return
	 * @category 添加安保记录
	 */
	public boolean add(Safety safety);

	/**
	 * @param id
	 * @return
	 * @category 删除安保记录
	 */
	public boolean delete(int id);

	/**
	 * @return
	 * @category 更新安保记录
	 */
	public boolean update(Safety safety);

	/**
	 * @return
	 * @category 查询所有安保记录
	 */
	public List<SafetyVO> selectAll();

	/**
	 * @param uid
	 * @return
	 * @category 根据物业员工id查询安保记录
	 */
	public List<SafetyVO> selectByUserId(int uid);

	/**
	 * @return
	 * @category 根据安保类型查询
	 */
	public List<SafetyVO> selectByBySafekid(int kid);
}

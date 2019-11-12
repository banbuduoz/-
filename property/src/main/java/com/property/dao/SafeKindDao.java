package com.property.dao;

import java.util.List;

import com.property.bean.SafeKind;

public interface SafeKindDao {
	public int add(SafeKind safeKind);

	public int delete(int id);

	public int update(SafeKind safeKind);

	/**
	 * @return
	 * @category 查询所有安全类型
	 */
	public List<SafeKind> selectAll();

	/**
	 * @return
	 * @category 根据id查询安全类型
	 */
	public SafeKind selectById(int id);
}

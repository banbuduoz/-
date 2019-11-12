package com.property.service;

import java.util.List;

import com.property.bean.SafeKind;

public interface SafeKindService {
	public boolean add(SafeKind safeKind);

	public boolean delete(int id);

	public boolean update(SafeKind safeKind);

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

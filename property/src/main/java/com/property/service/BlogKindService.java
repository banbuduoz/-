package com.property.service;

import java.util.List;

import com.property.bean.BlogKind;

public interface BlogKindService {
	/**
	 * @param blogkind
	 * @return
	 * @category 增加blog类型
	 */
	public boolean add(BlogKind blogkind);

	/**
	 * @param id
	 * @return 根据类型id删除类型
	 */
	public boolean delete(int id);

	/**
	 * @param blogkind
	 * @return
	 * @category 更改类型
	 */
	public boolean update(BlogKind blogkind);

	/**
	 * @param id
	 * @return Blogkind
	 * @category 根据id查询blog类型
	 */
	public BlogKind select(int id);

	/**
	 * @return
	 * @category 查询所有类型
	 */
	public List<BlogKind> selectAll();
}

package com.property.dao;

import java.util.List;

import com.property.bean.BlogKind;

/**
 * @author 张延龙
 * @category 博客类型接口
 *
 */
public interface BlogKindDao {
	/**
	 * @param blogkind
	 * @return
	 * @category 增加blog类型
	 */
	public int add(BlogKind blogkind);

	/**
	 * @param id
	 * @return 根据类型id删除类型
	 */
	public int delete(int id);

	/**
	 * @param blogkind
	 * @return
	 * @category 更改类型
	 */
	public int update(BlogKind blogkind);

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

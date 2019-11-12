package com.property.dao;

import java.util.List;

import com.property.bean.Blog;

/**
 * @author 张延龙
 * @category 博客接口
 *
 */
public interface BlogDao {
	/**
	 * @param blog
	 * @category 添加博客
	 */
	public int add(Blog blog);

	/**
	 * @param id
	 * @category 根绝id删除
	 */
	public int delete(int id);

	/**
	 * @param blog
	 *            更新论坛
	 */
	public int update(Blog blog);

	/**
	 * @param id
	 * @return 根据论坛id查询论坛详情
	 */
	public Blog selectById(int id);

	/**
	 * @param id
	 * @return 根据用户id查询返回blog列表
	 */
	public List<Blog> selectListByUserId(int uid);

	/**
	 * @param id
	 * @return 根据博客类型查询返回blog列表
	 */
	public List<Blog> selectListByKindId(int kid);

	/**
	 * @return 查询所有blog
	 */
	public List<Blog> selectAll();

	/**
	 * 通过关键字模糊查询
	 * 
	 * @param keyword
	 * @return
	 */
	public List<Blog> selectByKeyWord(String keyword);

	/**
	 * @return 查询首页的两条blog
	 */
	public List<Blog> selectBykidShowTwo(int kid);

	/**
	 * @return 查询首页的八条条公告
	 */
	public List<Blog> selectBykidShowEight(int kid);

}

package com.property.service;

import java.util.List;

import com.property.bean.Blog;
import com.property.vo.BlogVO;

/**
 * @author 张延龙
 * @category Blog业务逻辑接口
 */
public interface BlogService {
	/**
	 * @param blog
	 * @return
	 * @category 添加blog
	 */
	public boolean add(Blog blog);

	/**
	 * @param id
	 * @return
	 * @category 删除blog
	 */
	public boolean delete(int id);

	/**
	 * @param blog
	 * @return
	 * @category 更新blog
	 */
	public boolean update(Blog blog);

	/**
	 * @param id
	 * @return 根据论坛id查询论坛详情
	 */
	public Blog selectById(int id);

	/**
	 * @param id
	 * @return 根据用户id查询返回blog列表
	 */
	public List<BlogVO> selectListByUserId(int uid);

	/**
	 * @param id
	 * @return 根据博客类型查询返回blog列表
	 */
	public List<BlogVO> selectListByKindId(int kid);

	/**
	 * @return 查询所有blog
	 */
	public List<BlogVO> selectAll();

	/**
	 * 通过关键字模糊查询
	 * 
	 * @param keyword
	 * @return
	 */
	public List<BlogVO> selectByKeyWord(String keyword);

	/**
	 * @return 查询首页的两条blog
	 */
	public List<BlogVO> selectBykidShowTwo(int kid);

	/**
	 * @return 查询首页的八条条公告
	 */
	public List<BlogVO> selectBykidShowEight(int kid);
	
}

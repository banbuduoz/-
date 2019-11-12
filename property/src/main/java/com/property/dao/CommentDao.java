package com.property.dao;

import java.util.List;

import com.property.bean.Comment;

/**
 * @author 张延龙
 * @category 评论数据访问接口
 *
 */
public interface CommentDao {
	/**
	 * @param comment
	 * @return
	 * @category 添加评论
	 */
	public int add(Comment comment);

	/**
	 * @param id
	 * @return
	 * @category 根据id删除id
	 */
	public int delete(int id);

	/**
	 * @param id
	 * @return
	 * @category 根据用户id删除id
	 */
	public int deleteByUserId(int uid);

	/**
	 * @param id
	 * @return
	 * @category 根据blogid删除id
	 */
	public int deleteByBlogId(int bid);

	/**
	 * 更新评论
	 * 
	 * @param comment
	 * @return
	 */
	public int update(Comment comment);

	/**
	 * @return Comment
	 * @category 查询blog下所有评论
	 */
	public List<Comment> selectByBlogId(int bid);

	/**
	 * @return Comment
	 * @category 查询用户所有评论
	 */
	public List<Comment> selectByUserId(int uid);

}

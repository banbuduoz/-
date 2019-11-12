package com.property.service;

import java.util.List;

import com.property.bean.Comment;
import com.property.vo.CommentVO;

/**
 * @author 张延龙
 * @category 评论业务逻辑接口
 */
public interface CommentService {
	/**
	 * @param comment
	 * @return
	 * @category 添加评论
	 */
	public boolean add(Comment comment);

	/**
	 * @param id
	 * @return
	 * @category 根据id删除id
	 */
	public boolean delete(int id);

	/**
	 * @param id
	 * @return
	 * @category 根据用户id删除id
	 */
	public boolean deleteByUserId(int uid);

	/**
	 * @param id
	 * @return
	 * @category 根据blogid删除id
	 */
	public boolean deleteByBlogId(int bid);

	/**
	 * 更新评论
	 * 
	 * @param comment
	 * @return
	 */
	public boolean update(Comment comment);

	/**
	 * @return Comment
	 * @category 查询blog下所有评论
	 */
	public List<CommentVO> selectByBlogId(int bid);

	/**
	 * @return Comment
	 * @category 查询用户所有评论
	 */
	public List<Comment> selectByUserId(int uid);
}

package com.property.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property.bean.Comment;
import com.property.dao.CommentDao;
import com.property.service.CommentService;
import com.property.service.UserService;
import com.property.vo.CommentVO;
@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentDao commentDao;
	@Autowired
	private UserService userService;

	@Override
	public boolean add(Comment comment) {
		return commentDao.add(comment) > 0 ? true : false;
	}

	@Override
	public boolean delete(int id) {
		return commentDao.delete(id) > 0 ? true : false;
	}

	@Override
	public boolean deleteByUserId(int uid) {
		return commentDao.deleteByUserId(uid) > 0 ? true : false;
	}

	@Override
	public boolean deleteByBlogId(int bid) {
		return commentDao.deleteByBlogId(bid) > 0 ? true : false;
	}

	@Override
	public boolean update(Comment comment) {
		return commentDao.update(comment) > 0 ? true : false;
	}

	@Override
	public List<CommentVO> selectByBlogId(int bid) {
		List<Comment> list = commentDao.selectByBlogId(bid);
		List list1 = new ArrayList();
		for (Comment comment : list) {
			CommentVO commentVO = new CommentVO(comment.getId(), comment.getUid(), comment.getBid(), comment.getIp(),
					comment.getContent());
			String userName = userService.selectById(comment.getUid()).getName();
			commentVO.setUserName(userName);
			list1.add(commentVO);
		}
		return list1;
	}

	@Override
	public List<Comment> selectByUserId(int uid) {
		return null;
	}

}

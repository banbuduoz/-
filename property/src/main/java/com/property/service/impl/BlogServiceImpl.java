package com.property.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property.bean.Blog;
import com.property.bean.User;
import com.property.dao.BlogDao;
import com.property.service.BlogKindService;
import com.property.service.BlogService;
import com.property.service.CommentService;
import com.property.service.UserService;
import com.property.vo.BlogVO;

@Service
public class BlogServiceImpl implements BlogService {
	@Autowired
	private BlogDao blogDao;
	@Autowired
	private CommentService commentService;

	@Autowired
	private UserService userService;
	@Autowired
	private BlogKindService blogKindService;

	@Override
	public boolean add(Blog blog) {
		return blogDao.add(blog) > 0 ? true : false;
	}

	@Override
	public boolean update(Blog blog) {
		return blogDao.update(blog) > 0 ? true : false;
	}

	@Override
	public Blog selectById(int id) {
		return blogDao.selectById(id);
	}

	@Override
	public List<BlogVO> selectListByUserId(int uid) {
		List list = blogDao.selectListByUserId(uid);
		List<BlogVO> list1 = getBlogVO(list);
		return list1;
	}

	@Override
	public List<BlogVO> selectListByKindId(int kid) {
		List list = blogDao.selectListByKindId(kid);
		List<BlogVO> list1 = getBlogVO(list);
		return list1;
	}

	@Override
	public List<BlogVO> selectAll() {
		List list = blogDao.selectAll();
		List<BlogVO> list1 = getBlogVO(list);
		return list1;
	}

	@Override
	public List<BlogVO> selectByKeyWord(String keyword) {
		List list = blogDao.selectByKeyWord(keyword);
		List<BlogVO> list1 = getBlogVO(list);
		return list1;
	}

	@Override
	public List<BlogVO> selectBykidShowTwo(int kid) {
		List list = blogDao.selectBykidShowTwo(kid);
		List<BlogVO> list1 = getBlogVO(list);
		return list1;
	}

	@Override
	public List<BlogVO> selectBykidShowEight(int kid) {
		List list = blogDao.selectBykidShowEight(kid);
		List<BlogVO> list1 = getBlogVO(list);
		return list1;
	}

	@Override
	public boolean delete(int id) {
		commentService.deleteByBlogId(id);
		boolean flag = blogDao.delete(id) > 0 ? true : false;
		return flag;
	}

	private List<BlogVO> getBlogVO(List<Blog> blogs) {
		List list = new ArrayList();
		for (Blog blog : blogs) {
			BlogVO blogVO = new BlogVO(blog.getId(), blog.getKid(), blog.getUid(), blog.getTitle(), blog.getContent(),
					blog.getDatetime());
			User user = userService.selectById(blog.getUid());
			String userName = user.getName();
			blogVO.setUserName(userName);

			String kindName = blogKindService.select(blog.getKid()).getName();
			blogVO.setKindName(kindName);
			list.add(blogVO);
		}
		return list;
	}
}

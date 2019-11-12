package com.property.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.property.bean.Comment;
import com.property.dao.CommentDao;

public class Test10 {
	@Test
	
	 public void test() { ApplicationContext context = new
	 ClassPathXmlApplicationContext("spring/spring.xml"); CommentDao
	 commentDao = context.getBean(CommentDao.class); Comment comment=new
	Comment(1, 2, "2200", "东方季店"); commentDao.add(comment); }
	
	/*
	 * public void test() { ApplicationContext context = new
	 * ClassPathXmlApplicationContext("spring/spring.xml"); CommentDao
	 * commentDao = context.getBean(CommentDao.class); commentDao.delete(3); }
	 */
	
/*	 public void test() { ApplicationContext context = new
	 ClassPathXmlApplicationContext("spring/spring.xml"); CommentDao
	  commentDao = context.getBean(CommentDao.class); Comment comment=new
	  Comment(2, 1, 2, "1251436", "嘻嘻嘻嘻"); commentDao.update(comment); }
	 */
/*	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		CommentDao commentDao = context.getBean(CommentDao.class);
		commentDao.selectByBlogId(1);
		System.out.println(commentDao);
	}*/
/*	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		CommentDao commentDao = context.getBean(CommentDao.class);
		commentDao.deleteByUserId(1);
}*/
}
package com.property.test;

import java.sql.Timestamp;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.property.bean.Blog;
import com.property.dao.BlogDao;

public class Test1 {

	@Test
	public void t1() {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		BlogDao blogDao = context.getBean(BlogDao.class);
		Blog blog = new Blog();
		blog.setContent("123456");
		blog.setKid(1);
		blog.setUid(1);
		blog.setTitle("wz");
		blog.setDatetime(new Timestamp(System.currentTimeMillis()));
		System.out.println(blogDao.add(blog));
		
	}
}


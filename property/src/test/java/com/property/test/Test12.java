package com.property.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.request.NativeWebRequest;

import com.property.bean.SafeKind;
import com.property.dao.SafeKindDao;

public class Test12 {
	@Test
	/*
	 * public void test() { ApplicationContext context = new
	 * ClassPathXmlApplicationContext("spring/spring.xml"); SafeKindDao
	 * safeKindDao = context.getBean(SafeKindDao.class); SafeKind safeKind=new
	 * SafeKind(); safeKind.setName("你是个好学生"); safeKindDao.add(safeKind); }
	 */
	/*
	 * public void test() { ApplicationContext context = new
	 * ClassPathXmlApplicationContext("spring/spring.xml"); SafeKindDao
	 * safeKindDao = context.getBean(SafeKindDao.class); safeKindDao.delete(5);
	 * }
	 */
	/*
	 * public void test() { ApplicationContext context = new
	 * ClassPathXmlApplicationContext("spring/spring.xml"); SafeKindDao
	 * safeKindDao = context.getBean(SafeKindDao.class); SafeKind safeKind=new
	 * SafeKind(); safeKind.setId(6); safeKind.setName("name");
	 * safeKindDao.update(safeKind); }
	 */
/*	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		SafeKindDao safeKindDao = context.getBean(SafeKindDao.class);
		safeKindDao.selectAll();
	}*/
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		SafeKindDao safeKindDao = context.getBean(SafeKindDao.class);
	   safeKindDao.selectById(6);
	   System.out.println(safeKindDao.selectById(6).getName());
	}
}

package com.property.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.property.dao.UserDao;

public class Test9 {

	@Test
	public void t1(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		UserDao userDao = context.getBean(UserDao.class);
		System.out.println(userDao.selectByLoginPass("wz", "111").getLoginname());;
//		System.out.println(roleDao.selectAll().size());
//		System.out.println(roleDao.selectById(2).getName());
//		Role role = new Role();
//		role.setName("小红红");
//		role.setId(7);
//		//System.out.println(roleDao.add(role));
//		//System.out.println(roleDao.update(role));
//		System.out.println(roleDao.delete(7));
	}
}

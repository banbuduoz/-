package com.property.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.property.bean.User;
import com.property.dao.UserDao;

public class Test13 {
	@Test
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring.xml");
		UserDao userDao = applicationContext.getBean(UserDao.class);
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("name", "王");
//		List<User> list = userDao.selectByName(map);
		 List<User> list = userDao.selectAll();
		for (User user : list) {
			System.out.println(user.getName());
		}
	}
}

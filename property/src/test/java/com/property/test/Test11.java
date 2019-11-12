package com.property.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.property.bean.UserFamily;
import com.property.dao.UserFamilyDao;

public class Test11 {
	@Test
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring.xml");
		UserFamilyDao userFamilyDao = applicationContext.getBean(UserFamilyDao.class);
		System.out.println(userFamilyDao);
		// UserFamily userFamily = userFamilyDao.selectById(1);
		// System.out.println(userFamily.getName());
		// List<UserFamily> list = userFamilyDao.selectAll();
		// System.out.println(list.size());
		// System.out.println(userFamilyDao.selectByUid(1).size());
		// UserFamily userFamily = new UserFamily();
		// userFamily.setId(1);
		// userFamily.setRelation("大爷");
		// System.out.println(userFamilyDao.update(userFamily));
		UserFamily userFamily = new UserFamily("白虎", 'm', "123456", "relation", 1);
		System.out.println(userFamilyDao.add(userFamily));
	}
}

package com.property.test;

import java.sql.Timestamp;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.request.NativeWebRequest;

import com.property.bean.SafeKind;
import com.property.bean.Safety;
import com.property.dao.SafetyDao;

public class Test14 {
	@Test
/*	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		SafetyDao safetyDao = context.getBean(SafetyDao.class);
		Safety safety=new Safety();
		safety.setStarttime(new Timestamp(System.currentTimeMillis()));
		safety.setEndtime(new Timestamp(System.currentTimeMillis()));
		safetyDao.add(safety);
	}*/
	/*public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		SafetyDao safetyDao = context.getBean(SafetyDao.class);
		safetyDao.delete(1);
	}*/
/*	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		SafetyDao safetyDao = context.getBean(SafetyDao.class);
		 Safety safety=new Safety(2, new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()), "2", 1);
		safetyDao.update(safety);
	}	*/
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		SafetyDao safetyDao = context.getBean(SafetyDao.class);
		safetyDao.selectByBySafekid(1);
		System.out.println(safetyDao.selectByBySafekid(1));
	}
}

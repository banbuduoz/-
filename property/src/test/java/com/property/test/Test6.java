package com.property.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.property.bean.Carport;
import com.property.dao.CarportDao;

public class Test6 {
	@Test
/*	public void t1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		CarportDao carportDao=context.getBean(CarportDao.class);
		carportDao.select();
	}*/
	public void t1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		CarportDao carportDao=context.getBean(CarportDao.class);
		Carport carport=new Carport();
		carport.setNumber(30);
           System.out.println(carportDao.update(carport));
	}
}

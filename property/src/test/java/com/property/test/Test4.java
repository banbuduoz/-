package com.property.test;

import java.sql.Timestamp;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.request.NativeWebRequest;

import com.property.bean.Car;
import com.property.dao.CarDao;

public class Test4 {
	@Test
	/*
	 * public void test(){ ApplicationContext context =new
	 * ClassPathXmlApplicationContext("spring/spring.xml"); CarDao
	 * carDao=context.getBean(CarDao.class); Car car=new Car();
	 * car.setIntime(new Timestamp(System.currentTimeMillis()));
	 * System.out.println(carDao.add(car)); }
	 */
	/*
	 * public void test(){ ApplicationContext context =new
	 * ClassPathXmlApplicationContext("spring/spring.xml"); CarDao
	 * carDao=context.getBean(CarDao.class); carDao.delete(2); }
	 */
	/*
	 * public void test(){ ApplicationContext context =new
	 * ClassPathXmlApplicationContext("spring/spring.xml"); CarDao
	 * carDao=context.getBean(CarDao.class); Car car=new Car(1, "yang", new
	 * Timestamp(System.currentTimeMillis()), new
	 * Timestamp(System.currentTimeMillis()), 22.0, "", 1); carDao.update(car);
	 * 
	 * 
	 * }
	 */
	/*
	 * public void test() { ApplicationContext context = new
	 * ClassPathXmlApplicationContext("spring/spring.xml"); CarDao carDao =
	 * context.getBean(CarDao.class); carDao.selectAll();
	 * 
	 * }
	 */
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		CarDao carDao = context.getBean(CarDao.class);
		carDao.selectByCarnum("yang");
	}
}

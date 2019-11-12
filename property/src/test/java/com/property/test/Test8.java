package com.property.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.property.bean.Charge;
import com.property.dao.ChargeDao;

public class Test8 {
	@Test

	/*
	 * public void t1() { ApplicationContext context = new
	 * ClassPathXmlApplicationContext("spring/spring.xml"); ChargeDao
	 * chargeDao=context.getBean(ChargeDao.class); Charge charge=new Charge();
	 * charge.setChargeinfo(11.1); charge.setName("ddd"); chargeDao.add(charge);
	 * }
	 */
	/*
	 * public void t1() { ApplicationContext context = new
	 * ClassPathXmlApplicationContext("spring/spring.xml"); ChargeDao
	 * chargeDao=context.getBean(ChargeDao.class); chargeDao.delete(5); }
	 */

	public void t1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		ChargeDao chargeDao = context.getBean(ChargeDao.class);
		Charge charge = new Charge(4, "近来可好", 2.3);
		chargeDao.update(charge);
	}

	/*
	 * public void t1() { ApplicationContext context = new
	 * ClassPathXmlApplicationContext("spring/spring.xml"); ChargeDao chargeDao
	 * = context.getBean(ChargeDao.class); chargeDao.selectAll(); }
	 */
}

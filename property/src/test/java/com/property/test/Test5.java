package com.property.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.property.bean.Pay;
import com.property.dao.PayDao;

public class Test5 {

	@Test
	public void t1(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		PayDao payDao = context.getBean(PayDao.class);
		System.out.println(payDao.selectByPaymonth("六月").size());
		System.out.println(payDao.selectByUserId(1).size());
		Pay pay = new Pay();
		pay.setChargename("电费");
		pay.setUid(1);
		pay.setPaystate(0);
		pay.setChargestandard(3000.0);
		pay.setPayreal(3000.0);
		pay.setId(2);
		System.out.println(payDao.add(pay));
		System.out.println(payDao.update(pay));
		System.out.println(payDao.delete(2));
	}
}

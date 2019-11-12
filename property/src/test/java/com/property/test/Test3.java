package com.property.test;

import java.sql.Date;
import java.sql.Timestamp;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.property.bean.House;
import com.property.dao.HouseDao;

public class Test3 {

	@Test
	public void t1(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		HouseDao houseDao = context.getBean(HouseDao.class);
		System.out.println(houseDao.selectAll().size());
		System.out.println(houseDao.selectByHouseId(1).getName());
		House house = new House();
		house.setBuildendtime(new Date(System.currentTimeMillis()));
		house.setBuildstarttime(new Date(System.currentTimeMillis()));
		house.setArea(123.2);
		//house.setId(1);
		house.setInfo("xiao");
		house.setName("八单元");
		//System.out.println(houseDao.update(house));
		System.out.println(houseDao.add(house));
		System.out.println(houseDao.delete(8));
	}
}

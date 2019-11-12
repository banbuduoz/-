package com.property.test;

import java.sql.Timestamp;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.property.bean.Service;
import com.property.dao.ServiceDao;

public class Test16 {

	@Test
	public void t1(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		ServiceDao serviceDao = context.getBean(ServiceDao.class);
//		System.out.println(serviceDao.selectAll().size());
//		System.out.println(serviceDao.selectById(1).getTitle());
//		System.out.println(serviceDao.selectByKid(2).size());
//		System.out.println(serviceDao.selectBySid(1).size());
		System.out.println(serviceDao.selectByUid(1).size());
		Service service = new Service();
		service.setTitle("坏了");
		service.setInfo("被你打坏了");
		service.setUid(1);
		service.setSid(1);
		service.setStarttime(new Timestamp(System.currentTimeMillis()));
		service.setEndtime(new Timestamp(System.currentTimeMillis()));
		service.setAppraise("差评");
		service.setKindid(1);
		service.setResult("差点"); 
		service.setId(2);
		//System.out.println(serviceDao.add(service));
		//System.out.println(serviceDao.update(service));
		int[] nums = {3,4,5};
		System.out.println(serviceDao.delete(nums));
	}
}

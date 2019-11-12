package com.property.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.property.service.UserFamilyService;
import com.property.vo.UserFamilyVO;

public class Test18 {

	@Test
	public void t1(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		UserFamilyService  familyService = context.getBean(UserFamilyService.class);
//		 List<UserFamilyVO> list = familyService.selectAll();
//		for (UserFamilyVO userFamilyVO : list) {
//			System.out.println(userFamilyVO.getuName());
//		}
		System.out.println(familyService.delete(3));
	}
}

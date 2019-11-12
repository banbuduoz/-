package com.property.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.property.bean.ServiceKind;
import com.property.service.ServiceKindService;

public class Test20 {

	@Test
	public void t1(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		ServiceKindService kindService = context.getBean(ServiceKindService.class);
		List<ServiceKind> list = kindService.selectAll();
		for (ServiceKind serviceKind : list) {
			System.out.println(serviceKind.getName());
		}
		
	}
}

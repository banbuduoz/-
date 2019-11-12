package com.property.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.property.bean.Person;
import com.property.dao.PersonDao;

public class Test7 {

	@Test
	public void t1(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		PersonDao personDao = context.getBean(PersonDao.class);
		System.out.println(personDao.selectAll().size());
		System.out.println(personDao.selectByUserId(1));
		Person person = new Person();
		person.setName("大哥");
		person.setTel("1112");
		person.setId(2);
		//System.out.println(personDao.add(person));
		//System.out.println(personDao.update(person));
		System.out.println(personDao.delete(4));
	}
}

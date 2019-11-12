package com.property.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.property.bean.Room;
import com.property.dao.RoomDao;

public class Test15 {

	@Test
	public void t1(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		RoomDao roomDao = context.getBean(RoomDao.class);
		//System.out.println(roomDao.selectAll().size());
		//System.out.println(roomDao.selectByUserId(1).getName());
		//System.out.println(roomDao.selectByHouseId(1).size());
		Room room = new Room();
		room.setName("1025");
		room.setHid(1);
		room.setUid(1);
		//System.out.println(roomDao.add(room));
		room.setUname("喵喵");
		room.setArea(121.0);
		room.setId(2);
		//System.out.println(roomDao.update(room));
		System.out.println(roomDao.delete(3));
	}
}

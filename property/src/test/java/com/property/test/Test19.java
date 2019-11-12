package com.property.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.property.bean.BlogKind;
import com.property.service.BlogKindService;
import com.property.service.CarportService;
import com.property.service.CommentService;
import com.property.service.PersonService;
import com.property.vo.CommentVO;
import com.property.vo.PersonVO;

public class Test19 {
	@Test
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring.xml");
		// BlogKindService blogKindService =
		// applicationContext.getBean(BlogKindService.class);
		// List<BlogKind> list = blogKindService.selectAll();
		// for (BlogKind blogKind : list) {
		// System.out.println(blogKind.getName());
		// }
		// CommentService commentService =
		// applicationContext.getBean(CommentService.class);
		// List<CommentVO> list = commentService.selectByBlogId(2);
		// for (CommentVO commentVO : list) {
		// System.out.println(commentVO.getUserName());
		// }
		PersonService personService = applicationContext.getBean(PersonService.class);
		List<PersonVO> list = personService.selectAll();
		for (PersonVO personVO : list) {
			System.out.println(personVO.getUname());
		}

	}

}

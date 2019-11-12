package com.property.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property.bean.Person;
import com.property.dao.PersonDao;
import com.property.dao.UserDao;
import com.property.service.PersonService;
import com.property.vo.PersonVO;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDao personDao;

	@Autowired
	private UserDao userDao;

	@Override
	public boolean add(Person person) {
		return personDao.add(person) > 0 ? true : false;
	}

	@Override
	public boolean delete(int id) {
		return personDao.delete(id) > 0 ? true : false;
	}

	@Override
	public boolean update(Person person) {
		return personDao.update(person) > 0 ? true : false;
	}

	@Override
	public List<PersonVO> selectAll() {
		List<PersonVO> list = getVO(personDao.selectAll());
		return list;
	}

	@Override
	public List<PersonVO> selectByUserId(int uid) {
		return getVO(personDao.selectByUserId(uid));
	}

	private List<PersonVO> getVO(List<Person> persons) {
		List<PersonVO> list = new ArrayList<PersonVO>();
		for (Person person : persons) {
			PersonVO personVO = new PersonVO(person.getId(), person.getName(), person.getTel(), person.getIntime(),
					person.getOuttime(), person.getVisitname(), person.getInfo(), person.getUid(),
					userDao.selectById(person.getUid()).getName());
			list.add(personVO);
		}
		return list;
	}

	@Override
	public Person selectById(int id) {
		return personDao.selectById(id);
	}

}

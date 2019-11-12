package com.property.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.stereotype.Service;

import com.property.bean.User;
import com.property.bean.UserFamily;
import com.property.dao.UserDao;
import com.property.dao.UserFamilyDao;
import com.property.service.UserFamilyService;
import com.property.vo.UserFamilyVO;

@Service
public class UserFamilyServiceImpl implements UserFamilyService {

	@Resource
	private UserFamilyDao userFamilyDao;
	@Resource
	private UserDao userDao;

	public void change(List<UserFamilyVO> voList, List<UserFamily> userFamilyLiset) {
		for (UserFamily userFamily : userFamilyLiset) {
			User user = userDao.selectById(userFamily.getUid());
			String uName = user.getName();
			UserFamilyVO vo = new UserFamilyVO(userFamily.getId(), userFamily.getName(), userFamily.getSex(),
					userFamily.getTel(), userFamily.getRelation(), userFamily.getUid(), uName);
			voList.add(vo);
		}
	}

	@Override
	public UserFamily selectById(int id) {
		return userFamilyDao.selectById(id);
	}

	
	@Override
	public List<UserFamilyVO> selectAll() {
		List<UserFamilyVO> voList = new ArrayList<>();
		change(voList, userFamilyDao.selectAll());
		return voList;
	}

	@Override
	public List<UserFamilyVO> selectByUid(int uid) {
		List<UserFamilyVO> voList = new ArrayList<>();
		change(voList, userFamilyDao.selectByUid(uid));
		return voList;
	}

	@Override
	public boolean update(UserFamily userFamily) {
		return userFamilyDao.update(userFamily) > 0 ? true : false;
	}

	@Override
	public boolean delete(int id) {
		return userFamilyDao.delete(id)>0?true:false;
	}

	@Override
	public boolean add(UserFamily userFamily) {
		return userFamilyDao.add(userFamily) > 0 ? true : false;
	}

}

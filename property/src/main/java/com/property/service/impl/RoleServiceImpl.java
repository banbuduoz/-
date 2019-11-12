package com.property.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property.bean.Role;
import com.property.dao.RoleDao;
import com.property.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDao roleDao;

	@Override
	public boolean add(Role role) {
		return roleDao.add(role) > 0 ? true : false;
	}

	@Override
	public boolean delete(int id) {
		return roleDao.delete(id) > 0 ? true : false;
	}

	@Override
	public boolean update(Role role) {
		return roleDao.update(role) > 0 ? true : false;
	}

	@Override
	public List<Role> selectAll() {
		return roleDao.selectAll();
	}

	@Override
	public Role selectById(int id) {
		return roleDao.selectById(id);
	}

}

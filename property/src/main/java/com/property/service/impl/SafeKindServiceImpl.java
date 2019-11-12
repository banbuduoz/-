package com.property.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property.bean.SafeKind;
import com.property.dao.SafeKindDao;
import com.property.service.SafeKindService;
@Service
public class SafeKindServiceImpl implements SafeKindService {

	@Autowired
	private SafeKindDao safeKindDao;

	@Override
	public boolean add(SafeKind safeKind) {
		return safeKindDao.add(safeKind) > 0 ? true : false;
	}

	@Override
	public boolean delete(int id) {
		return safeKindDao.delete(id) > 0 ? true : false;
	}

	@Override
	public boolean update(SafeKind safeKind) {
		return safeKindDao.update(safeKind) > 0 ? true : false;
	}

	@Override
	public List<SafeKind> selectAll() {
		return safeKindDao.selectAll();
	}

	@Override
	public SafeKind selectById(int id) {
		return safeKindDao.selectById(id);
	}

}

package com.property.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property.bean.BlogKind;
import com.property.dao.BlogKindDao;
import com.property.service.BlogKindService;
@Service
public class BlogKindServiceImpl implements BlogKindService {
	@Resource
	private BlogKindDao blogKindDao;

	@Override
	public boolean add(BlogKind blogkind) {
		return blogKindDao.add(blogkind)>0?true:false;
	}

	@Override
	public boolean delete(int id) {
		return blogKindDao.delete(id)>0?true:false;
	}

	@Override
	public boolean update(BlogKind blogkind) {
		return blogKindDao.update(blogkind)>0?true:false;
	}

	@Override
	public BlogKind select(int id) {
		return blogKindDao.select(id);
	}

	@Override
	public List<BlogKind> selectAll() {
		return blogKindDao.selectAll();
	}

}

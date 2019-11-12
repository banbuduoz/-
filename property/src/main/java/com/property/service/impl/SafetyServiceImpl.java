package com.property.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.property.bean.Safety;
import com.property.dao.SafeKindDao;
import com.property.dao.SafetyDao;
import com.property.dao.UserDao;
import com.property.service.SafetyService;
import com.property.vo.SafetyVO;

@Service
public class SafetyServiceImpl implements SafetyService {
	@Resource
	private UserDao userDao;
	@Resource
	private SafeKindDao safeKindDao;
	@Resource
	private SafetyDao safetydao;

	private List<SafetyVO> getVO(List<Safety> safeties) {
		List<SafetyVO> list = new ArrayList<SafetyVO>();
		for (Safety safety : safeties) {
			String uname = userDao.selectById(safety.getId()).getName();
			String kname = safeKindDao.selectById(safety.getId()).getName();
			SafetyVO safetyVO = new SafetyVO(kname, uname, safety.getId(), safety.getSafekid(), safety.getStarttime(),
					safety.getEndtime(), safety.getInfo(), safety.getUid());
			list.add(safetyVO);
		}
		return list;

	}

	@Override
	public boolean add(Safety safety) {
		return safetydao.add(safety) > 0 ? true : false;
	}

	@Override
	public boolean delete(int id) {
		return false;
	}

	@Override
	public boolean update(Safety safety) {
		return safetydao.add(safety) > 0 ? true : false;
	}

	@Override
	public List<SafetyVO> selectAll() {
		List<Safety> safeties=safetydao.selectAll();
		List<SafetyVO> list=getVO(safeties);
		
		return list;
	} 

	@Override
	public List<SafetyVO> selectByUserId(int uid) {
		List<Safety> safeties=safetydao.selectByBySafekid(uid);
		List<SafetyVO> list=getVO(safeties);
		return list;
	}

	@Override
	public List<SafetyVO> selectByBySafekid(int kid) {
		List<Safety> safeties=safetydao.selectByBySafekid(kid);
		List<SafetyVO> list=getVO(safeties);
		return list;
	}

}

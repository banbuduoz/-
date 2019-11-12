package com.property.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.property.bean.Service;
import com.property.bean.ServiceKind;
import com.property.bean.State;
import com.property.bean.User;
import com.property.dao.ServiceDao;
import com.property.dao.ServiceKindDao;
import com.property.dao.StateDao;
import com.property.dao.UserDao;
import com.property.service.ServiceService;
import com.property.vo.ServiceVO;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {

	
	@Resource
	private ServiceDao serviceDao;
	@Resource
	private UserDao userDao;
	@Resource
	private StateDao stateDao;
	@Resource
	private ServiceKindDao serviceKindDao;

	public void change(List<ServiceVO> voLisrt, List<Service> serviceLiset) {
		for (Service service : serviceLiset) {
			User user = userDao.selectById(service.getUid());
			State state = stateDao.selectById(service.getSid());
			ServiceKind kind = serviceKindDao.selectById(service.getKindid());
			String uName = user.getName();
			String sName = state.getName();
			String kName = kind.getName();
			ServiceVO vo = new ServiceVO(service.getId(), service.getTitle(), service.getInfo(), service.getUid(),
					service.getSid(), service.getStarttime(), service.getEndtime(), service.getAppraise(),
					service.getKindid(), service.getResult(), uName, sName, kName);
			voLisrt.add(vo);
		}
	}

	@Override
	public Service selectById(int id) {
		return serviceDao.selectById(id);
	}

	@Override
	public List<ServiceVO> selectAll() {
		List<ServiceVO> voLisrt = new ArrayList<>();
		change(voLisrt, serviceDao.selectAll());
		return voLisrt;
	}

	@Override
	public List<ServiceVO> selectByKid(int kindid) {
		List<ServiceVO> voLisrt = new ArrayList<>();
		change(voLisrt, serviceDao.selectByKid(kindid));
		return voLisrt;
	}

	@Override
	public List<ServiceVO> selectBySid(int sid) {
		List<ServiceVO> voLisrt = new ArrayList<>();
		change(voLisrt, serviceDao.selectBySid(sid));
		return voLisrt;
	}

	@Override
	public List<ServiceVO> selectByUid(int uid) {
		List<ServiceVO> voLisrt = new ArrayList<>();
		change(voLisrt, serviceDao.selectByUid(uid));
		return voLisrt;
	}

	@Override
	public boolean add(Service service) {
		service.setStarttime(new Timestamp(System.currentTimeMillis()));
		return serviceDao.add(service)>0?true:false;
	}

	@Override
	public boolean update(Service service) {
		return serviceDao.update(service)>0?true:false;
	}

	@Override
	public boolean delete(int[] ids) {
		return serviceDao.delete(ids)>0?true:false;
	}


}

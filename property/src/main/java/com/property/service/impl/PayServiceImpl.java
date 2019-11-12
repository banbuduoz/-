package com.property.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property.bean.Pay;
import com.property.bean.User;
import com.property.dao.PayDao;
import com.property.dao.UserDao;
import com.property.service.PayService;
import com.property.vo.PayVO;

@Service
public class PayServiceImpl implements PayService {

	@Autowired
	private PayDao payDao;

	@Resource
	private UserDao userDao;

	public void change(List<PayVO> voList, List<Pay> payList) {
		for (Pay pay : payList) {
			User user = userDao.selectById(pay.getUid());
			String uName = user.getName();
			PayVO vo = new PayVO(pay.getId(), pay.getChargename(), pay.getUid(), pay.getPaystate(),
					pay.getChargestandard(), pay.getPayreal(), pay.getPaybalance(), pay.getChargetime(),
					pay.getPaymonth(), uName);
			voList.add(vo);
		}
	}

	@Override
	public boolean add(Pay pay) {
		return payDao.add(pay) > 0 ? true : false;
	}

	@Override
	public boolean delete(int id) {
		return payDao.delete(id) > 0 ? true : false;
	}

	@Override
	public boolean update(Pay pay) {
		return payDao.update(pay) > 0 ? true : false;
	}

	@Override
	public Pay selectById(int id) {
		return payDao.selectById(id);
	}

	@Override
	public List<PayVO> selectByUserId(int id) {
		List<PayVO> voList = new ArrayList<>();
		change(voList, payDao.selectByUserId(id));
		return voList;
	}

	@Override
	public List<PayVO> selectAll() {
		List<PayVO> voList = new ArrayList<>();
		change(voList, payDao.selectAll());
		return voList;
	}

	@Override
	public List<PayVO> selectByPaymonth(String paymonth) {
		List<PayVO> voList = new ArrayList<>();
		change(voList, payDao.selectByPaymonth(paymonth));
		return voList;
	}

}

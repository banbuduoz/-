package com.property.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property.bean.User;
import com.property.dao.HouseDao;
import com.property.dao.RoleDao;
import com.property.dao.RoomDao;
import com.property.dao.UserDao;
import com.property.service.UserService;
import com.property.vo.UserVO;

/**
 * @author CJF
 * @category 用户业务逻辑实现类
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private HouseDao houseDao;
	@Autowired
	private RoomDao roomDao;
	@Autowired
	private RoleDao roleDao;

	private List<UserVO> getVO(List<User> users) {
		List<UserVO> list = new ArrayList<UserVO>();
		for (User user : users) {
			UserVO userVO = new UserVO(houseDao.selectByHouseId(user.getHouseid()).getName(),
					roomDao.selectById(user.getRoomid()).getName(), roleDao.selectById(user.getRoleid()).getName(),
					user.getId(), user.getName(), user.getLoginname(), user.getPass(), user.getTel(), user.getSex(),
					user.getUserurl(), user.getInputdate(), user.getIp(), user.getAge(), user.getHouseid(),
					user.getRoomid(), user.getRoleid(), user.getUserurl());
			list.add(userVO);
		}
		return list;
	}

	@Override
	public User selectById(int id) {

		return userDao.selectById(id);
	}

	@Override
	public List<UserVO> selectByName(String name) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", name);
		List<User> users = userDao.selectByName(map);
		List<UserVO> list = getVO(users);
		return list;
	}

	@Override
	public List<UserVO> selectAll() {
		List<User> users = userDao.selectAll();
		List<UserVO> list = getVO(users);
		return list;
	}

	@Override
	public List<UserVO> selectByRoId(int roleid) {
		List<User> users = userDao.selectByRoId(roleid);
		List<UserVO> list = getVO(users);
		return list;
	}

	@Override
	public List<UserVO> selectByHouseId(int houseid) {
		List<User> users = userDao.selectByHouseId(houseid);
		List<UserVO> list = getVO(users);
		return list;
	}

	@Override
	public User selectByRoomId(int roomid) {

		return userDao.selectByRoomId(roomid);
	}

	@Override
	public boolean update(User user) {

		return userDao.update(user) > 0 ? true : false;
	}

	@Override
	public boolean add(User user) {

		return userDao.add(user) > 0 ? true : false;
	}

	@Override
	public boolean delete(int id) {
		return false;
	}

	@Override
	public User selectByLoginPass(String loginname, String pass) {

		return userDao.selectByLoginPass(loginname, pass);
	}

	@Override
	public List<UserVO> selectByName2(String name) {
		List<User> users = userDao.selectByName2(name);
		List<UserVO> list = getVO(users);
		return list;
	}

	@Override
	public User selectByLoginName(String loginname) {
		return userDao.selectByLoginName(loginname);
	}

}

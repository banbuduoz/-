package com.property.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.property.bean.House;
import com.property.bean.Room;
import com.property.bean.User;
import com.property.service.HouseService;
import com.property.service.RoomService;
import com.property.service.UserService;
import com.property.vo.UserVO;

/**
 * @author CJF
 * @category 业主认证控制器
 */
@Controller
@RequestMapping("/approve")
public class ApproveController {
	@Resource
	private UserService userService;
	@Resource
	private HouseService houseService;
	@Resource
	private RoomService roomService;

	/**
	 * 查询全部游客账户
	 */
	@RequestMapping("/showuserlist")
	public String showuserlist(Model model) {
		List<UserVO> userVOs = userService.selectByRoId(1);
		model.addAttribute("userVOs", userVOs);
		return "showuserlist";
	}

	/**
	 * 跳转用户认证页面控制器
	 */
	@RequestMapping("/approveuser")
	public String approveuser(Integer id, Model model) {
		User user = userService.selectById(id);
		model.addAttribute("user", user);
		return "approveuser";
	}

	/**
	 * 用户认证控制器
	 */
	@RequestMapping("/approveing")
	public String approveing(@RequestParam("id") Integer id, @RequestParam("houseid") Integer houseid,
			@RequestParam("roomid") Integer roomid) {
		User user = userService.selectById(id);
		user.setHouseid(houseid);
		user.setRoomid(roomid);
		user.setRoleid(2);
		Room room = roomService.selectById(roomid);
		room.setUid(id);
		room.setUname(user.getName());
		roomService.update(room);
		boolean flag = userService.update(user);
		if (flag) {
			return "redirect:showuserlist.action";
		} else {
			return "404";
		}

	}

	/**
	 * 楼号房号联查
	 */
	@RequestMapping(value = "/showhm", produces = { "test/html;charset=utf-8;", "application/json;" })
	public @ResponseBody String showhm(@RequestParam(value = "type", required = true) String type,
			@RequestParam(value = "hid", required = false) String hid) {
		List list = null;
		if (type.equals("1")) {
			list = houseService.selectAll();
		} else if (type.equals("2")) {
			list = roomService.selectByHouseId(Integer.valueOf(hid));
		}
		return JSONArray.toJSONString(list);
	}

	/**
	 * 检查房间是否被认证
	 */
	@RequestMapping("/checkroom")
	public @ResponseBody String checkroom(Integer rid) {
		boolean flag = false;
		Room room = roomService.selectById(rid);
		System.out.println(room.getUid());
		if (room.getUid() == null) {
			flag = true;
			return JSON.toJSONString(flag);
		}
		return JSON.toJSONString(flag);
	}

}

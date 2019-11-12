package com.property.web;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.property.bean.User;
import com.property.service.UserService;
import com.property.vo.UserVO;

/**
 * @author 杨宏亮
 * @category 用户的信息管理
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;

	@RequestMapping("/toregist")
	public String toregist() {
		return "regist";
	}

	// 判断注册的控制器
	@RequestMapping("/registcheck")
	public @ResponseBody String registcheck(String loginname) {
		System.out.println("===========");
		boolean flag = false;
		if (userService.selectByLoginName(loginname) == null) {
			flag = true;
			return JSON.toJSONString(flag);

		}
		return JSON.toJSONString(flag);
	}

	// 注册
	@RequestMapping("/regist")
	public String regist(User user, HttpServletRequest request) {
		System.out.println("进入注册");

		// 如果数据库中没有这个用户，则可以跳转到登录页面
		user.setInputdate(new Timestamp(System.currentTimeMillis()));
		user.setIp(request.getRemoteAddr());
		user.setRoleid(0);
		System.out.println(user);
		boolean flag = userService.add(user);
		if (flag) {
			return "redirect:../login.action";
		} else {
			return "regist";
		}
	}

	// 更新个人信息
	@RequestMapping("/toupdate")
	public String toupdate(HttpSession session, Model model) {
		User usr = (User) session.getAttribute("current_user");
		User user = userService.selectById(usr.getId());
		model.addAttribute("user", user);
		return "updateUser";
	}

	@RequestMapping("/update")
	public String update(User user, HttpSession session) {
		User current_user = (User) session.getAttribute("current_user");
		userService.update(user);
		if (current_user.getId() == user.getId()) {
			return "redirect:../login.action";
		} else {
			return "success";
		}

	}

	// 展示个人信息
	@RequestMapping("/showinfo")
	public String showinfo(HttpSession session, Model model) {
		User user = (User) session.getAttribute("current_user");
		model.addAttribute("user", user);
		return "userinfo";
	}

	/**
	 * @param model
	 * @param rid
	 * @return
	 * @category 展示人员列表 rid=1时，展示游客用户及业主，rid=2时展示安保员工
	 */
	@RequestMapping("/userlist")
	public String userlist(Model model, Integer rid) {
		if (rid == null || rid == 0 || rid.equals("")) {
			Integer[] arr = { 1, 2, 3, 4, 7 };
			List<UserVO> userlist = getUserList(arr);
			model.addAttribute("userlist", userlist);
			return "userlist";
		} else {
			if (rid == 1) {
				Integer[] arr = { 1, 2, 7 };
				List<UserVO> userlist = getUserList(arr);
				model.addAttribute("userlist", userlist);
			} else {
				Integer[] arr = { 3, 4 };
				List<UserVO> userlist = getUserList(arr);
				model.addAttribute("userlist", userlist);
			}
			return "userlist";
		}
	}

	/**
	 * @param rid
	 * @return
	 * @category 获取用户列表
	 */
	private List<UserVO> getUserList(Integer[] rid) {
		List<UserVO> userlist = new ArrayList();
		for (Integer integer : rid) {
			List<UserVO> userlist0 = userService.selectByRoId(integer);
			for (UserVO userVO : userlist0) {
				userlist.add(userVO);
			}
		}
		return userlist;
	}

}

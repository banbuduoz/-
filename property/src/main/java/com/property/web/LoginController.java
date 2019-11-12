package com.property.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.property.bean.User;
import com.property.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	@RequestMapping("/tologin")
	public String tologin() {
		return "login";
	}

	@RequestMapping("/login")
	public String login(User user, HttpSession session) {
		System.out.println(user);
		if (userService.selectByLoginPass(user.getLoginname(), user.getPass()) != null) {
			User user2 = userService.selectByLoginPass(user.getLoginname(), user.getPass());
			session.setAttribute("current_user", userService.selectByLoginPass(user.getLoginname(), user.getPass()));
			session.setMaxInactiveInterval(60*30);
			return "redirect:index.action";
		} else {
			return "login";
		}
	}
	@RequestMapping("/loginout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:login.action";
	}
	
	

}

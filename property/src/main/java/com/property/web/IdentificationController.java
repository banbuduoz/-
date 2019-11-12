package com.property.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.property.bean.User;

/**
 * @author 张延龙
 *@category 身份认证
 */
@Controller
public class IdentificationController {
	@RequestMapping("/toidentification")
	public String toidentification() {
		return "identification";
	}
	@RequestMapping("/identification")
	public String identification(User user,Model model) {
		model.addAttribute("user", user);
		return "identification";
	}
	
}

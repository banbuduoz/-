package com.property.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.property.bean.BlogKind;
import com.property.bean.User;
import com.property.service.BlogKindService;
import com.property.service.BlogService;
import com.property.service.ServiceService;
import com.property.vo.BlogVO;
import com.property.vo.ServiceVO;

@Controller
public class IndexController {
	@Autowired
	private BlogKindService blogKindservice;
	@Autowired
	private BlogService blogService;
	@Autowired
	private ServiceService serviceService;

	@RequestMapping("/index")
	public String index(HttpSession session, Model model) {
		User user = (User) session.getAttribute("current_user");
		if (user.getRoleid() == 2) {
			List<BlogKind> blogKindList = blogKindservice.selectAll();
			List<BlogVO> shiwuList = blogService.selectBykidShowTwo(1);
			List<BlogVO> xunwuList = blogService.selectBykidShowEight(2);
			model.addAttribute("blogKindList", blogKindList);
			model.addAttribute("shiwuList", shiwuList);
			model.addAttribute("xunwuList", xunwuList);
			return "index1";
		} else if (user.getRoleid() == 7 || user.getRoleid() == 1) {
			return "index1";
		} else {
			List<ServiceVO> baoxiuList = serviceService.selectByKid(1);
			List<ServiceVO> tousuList = serviceService.selectByKid(2);
			model.addAttribute("baoxiuList", baoxiuList);
			model.addAttribute("tousuList", tousuList);
			return "index";
		}

	}
}

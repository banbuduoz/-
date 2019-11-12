package com.property.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.property.bean.Blog;
import com.property.bean.User;
import com.property.service.BlogService;
import com.property.vo.BlogVO;

/**
 * @author 张延龙
 * @category 公告控制器
 */
@Controller
public class AnnouncementController {

	@Autowired
	private BlogService blogService;

	@RequestMapping("/announcement")
	public String announcement(User user, Model model, Integer kid) {
		if (kid == null || kid == 0 || kid.equals("")) {
			List<BlogVO> announcementList = blogService.selectListByKindId(5);
			List<BlogVO> liveList = blogService.selectListByKindId(4);
			model.addAttribute("announcementList", announcementList);
			model.addAttribute("liveList", liveList);
			return "announcement";
		} else {
			List<BlogVO> announcementList = blogService.selectBykidShowEight(kid);
			model.addAttribute("announcementList", announcementList);
			model.addAttribute("kid", kid);
			return "announcement";
		}

	}

	@RequestMapping("toaddann")
	public String toaddann(HttpSession session) {
		User user = (User) session.getAttribute("current_user");
		if (user.getRoleid() == 2||user.getRoleid() == 0||user.getRoleid() == 1||user.getRoleid() == 7) {
			return "announcementcreateyezhu";
		} else {
			return "announcementcreatewuye";
		}
	}

	@RequestMapping("addann")
	public String addann(HttpSession session,Blog blog) {
		User user = (User) session.getAttribute("current_user");
		if ((user.getRoleid() == 2||user.getRoleid() == 0||user.getRoleid() == 1||user.getRoleid() == 7)){
			blogService.add(blog);
			return "success";
		} else if (user.getRoleid() == 3 || user.getRoleid() == 4||user.getRoleid() == 6) {
			blogService.add(blog);
			return "success";
		} else {
			blogService.add(blog);
			return "404";
		}
	}

}

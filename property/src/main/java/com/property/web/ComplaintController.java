package com.property.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.property.bean.Service;
import com.property.bean.ServiceKind;
import com.property.bean.State;
import com.property.bean.User;
import com.property.dao.StateDao;
import com.property.dao.UserDao;
import com.property.service.ServiceKindService;
import com.property.service.ServiceService;
import com.property.vo.ServiceVO;

/**
 * @author wz
 * @category 投诉类控制器
 */
@Controller
@RequestMapping("/complaint")
public class ComplaintController {

	@Resource
	private ServiceService serviceService;
	@Resource
	private StateDao stateDao;
	@Resource
	private ServiceKindService serviceKindService;
	@Resource
	private UserDao userDao;

	/**
	 * @param session
	 * @param model
	 * @return
	 * @category 查看所有申请
	 */
	@RequestMapping("/complaintselect")
	public String complaintselect(HttpSession session, Model model) {
		User user = (User) session.getAttribute("current_user");
		List<ServiceVO> serviceList = serviceService.selectByUid(user.getId());
		model.addAttribute("serviceList", serviceList);
		return "complaintselect";
	}

	/**
	 * @param session
	 * @param model
	 * @return
	 * @category 查询单个
	 */
	@RequestMapping("/complaintselectone")
	public String complaintselectone(int setviceid, Model model) {
		Service service = serviceService.selectById(setviceid);
		ServiceKind serviceKind = serviceKindService.selectById(service.getKindid());
		User user = userDao.selectById(service.getUid());
		State state = stateDao.selectById(service.getSid());
		model.addAttribute("service", service);
		model.addAttribute("serviceKind", serviceKind);
		model.addAttribute("user", user);
		model.addAttribute("state", state);
		return "complaintselectone";
	}

	@RequestMapping("/toadd")
	private String toadd() {
		return "complaintadd";
	}

	/**
	 * @category 发起投诉/报修
	 * @return
	 */
	@RequestMapping("/complaintadd")
	public String complaintadd(HttpSession session, Service service) {
		User user = (User) session.getAttribute("current_user");
		service.setUid(user.getId());
		service.setSid(1);
		System.out.println(service.getInfo());
		boolean flag = serviceService.add(service);
		System.out.println(flag);
		return "redirect:complaintselect.action";
	}

	@RequestMapping("/toupdate")
	private String toupdate(int service_id,Model model) {
		Service service = serviceService.selectById(service_id);
		ServiceKind serviceKind = serviceKindService.selectById(service.getKindid());
		User user = userDao.selectById(service.getUid());
		State state = stateDao.selectById(service.getSid());
		model.addAttribute("service", service);
		model.addAttribute("serviceKind", serviceKind);
		model.addAttribute("user", user);
		model.addAttribute("state", state);
		return "complaintupdate";
	}
	
	@RequestMapping("/complaintupdate")
	public String complaintupdate( Model model,Service service) {
			 serviceService.update(service);
		return "redirect:complaintselectone.action";
	}

	/**
	 * @param ids
	 * @return
	 * @category 删除
	 */
	@RequestMapping("/complaintdelete")
	public String complaintdelete(int[] ids) {
		boolean flag = serviceService.delete(ids);
		System.out.println(flag);
		return "redirect:complaintselect.action";
	}
}

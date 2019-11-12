package com.property.web;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.property.bean.Service;
import com.property.service.ServiceService;
import com.property.vo.ServiceVO;

/**
 * @author 张延龙
 * @category 处理报修投诉控制器
 */

@Controller
@RequestMapping("/dealtb")
public class DealtbController {

	@Autowired
	private ServiceService serviceService;

	/**
	 * 查询全部报修和投诉
	 */
	@RequestMapping("/todealtb")
	public String todealtb(Model model) {
		List<ServiceVO> baoxiuList = serviceService.selectByKid(1);
		List<ServiceVO> tousuList = serviceService.selectByKid(2);
		model.addAttribute("baoxiuList", baoxiuList);
		model.addAttribute("tousuList", tousuList);
		return "dealtb";
	}

	/**
	 * 处理中
	 */
	@RequestMapping("/dealservice")
	public String dealservice(Integer id) {
		Service service = serviceService.selectById(id);
		service.setSid(2);
		boolean flag = serviceService.update(service);
		if (flag) {
			return "redirect:todealtb.action";
		} else {
			return "404";
		}

	}

	/**
	 * 结束处理
	 */
	@RequestMapping("/dealserviceresult")
	public String dealserviceresult(Integer id, String result) {
		Service service = serviceService.selectById(id);
		service.setResult(result);
		service.setSid(3);
		service.setEndtime(new Timestamp(System.currentTimeMillis()));
		boolean flag = serviceService.update(service);
		if (flag) {
			return "redirect:todealtb.action";
		} else {
			return "404";
		}
	}

	@RequestMapping("/dealtb")
	public String dealtb(String serviceid) {

		return "redirect:todealtb.action";
	}

}

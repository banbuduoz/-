package com.property.web;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.property.bean.Car;
import com.property.bean.Person;
import com.property.bean.User;
import com.property.service.CarService;
import com.property.service.PersonService;
import com.property.service.UserService;
import com.property.vo.CarVO;
import com.property.vo.PersonVO;
import com.property.vo.UserVO;

/**
 * @author CJF
 * @category 来访管理控制器
 */
@Controller
@RequestMapping("/visit")
public class VisitController {
	@Resource
	private PersonService personService;
	@Resource
	private CarService carService;
	@Resource
	private UserService userService;

	/**
	 * 查询全部外来人员列表
	 */
	@RequestMapping("/showpersonlist")
	public String showpersonlist(Model model) {
		List<PersonVO> personVOs = personService.selectAll();
		// for (PersonVO personVO : personVOs) {
		// System.out.println(personVO);
		// }
		model.addAttribute("personVOs", personVOs);
		return "visitpersonlist";
	}

	/**
	 * 检查用户是否存在
	 */
	@RequestMapping("/checkuser")
	public @ResponseBody String checkuser(String visitname) {
		List<UserVO> list = userService.selectByName2(visitname);
		return JSONArray.toJSONString(list);
	}
	//
	// @RequestMapping(value = "/showcarlist", produces = {
	// "test/html;charset=utf-8;" })
	// public @ResponseBody String showcarlist(Model model) {
	// List<CarVO> list = carService.selectAll();
	// // model.addAttribute("carVOs", carVOs);
	// JSONArray.toJSONString(list);
	// return JSONArray.toJSONString(list);
	// }

	/**
	 * 进入外来人员添加页面
	 */
	@RequestMapping("/toaddvisitperson")
	public String toaddvisitperson() {
		return "addvisitperson";
	}

	/**
	 * 进入外来车辆添加页面
	 */
	@RequestMapping("/tovisitcarlist")
	public String toaddvisitcar(Model model) {
		List<CarVO> carVOs = carService.selectAll();
		model.addAttribute("carVOs", carVOs);
		return "visitcarlist";
	}

	/**
	 * 添加外来人员登记表
	 */
	@RequestMapping("/addvisitperson")
	public String addvisitperson(Person person, HttpSession session) {
		User user = (User) session.getAttribute("current_user");
		person.setIntime(new Timestamp(System.currentTimeMillis()));
		person.setUid(user.getId());
		System.out.println(person);
		boolean flag = personService.add(person);
		System.out.println(flag);
		return "redirect:showpersonlist.action";
	}

	/**
	 * 添加外来车辆信息
	 */
	@RequestMapping("/addvisitcar")
	public String addvisitcar(Car car) {
		System.out.println(car);
		String carnum = car.getCarnum();
		car.setCarnum(carnum.toUpperCase());
		car.setIntime(new Timestamp(System.currentTimeMillis()));
		boolean flag = carService.add(car);
		if (flag) {
			return "redirect:tovisitcarlist.action";
		} else {
			return "404";
		}

	}

	/**
	 * 外来人员离开控制器
	 * 
	 */
	@RequestMapping("/leavepserson")
	public String leavepserson(Integer id) {
		Person person = personService.selectById(id);
		person.setOuttime(new Timestamp(System.currentTimeMillis()));
		boolean flag = personService.update(person);
		if (flag) {
			return "redirect:showpersonlist.action";
		} else {
			return "404";
		}
	}

	/**
	 * 车辆离开，并计算费用
	 */
	@RequestMapping("/leavecar")
	public String leavecar(Integer id) {
		Car car = carService.selectById(id);
		Timestamp outtime = new Timestamp(System.currentTimeMillis());
		car.setOuttime(outtime);
		Timestamp intime = car.getIntime();
		long time = outtime.getTime() - intime.getTime();
		long x = 0;
		if (time % 3600000 != 0) {
			x = (time / 3600000 + 1) * 2;
		} else {
			x = (time / 3600000) * 2;
		}
		double pay = (double) x;
		car.setPay(pay);
		boolean flag = carService.update(car);
		if (flag) {
			return "redirect:tovisitcarlist.action";
		} else {
			return "404";
		}
	}

	/**
	 * 更改外来人员备注信息
	 */
	@RequestMapping("/changepersoninfo")
	public String changepersoninfo(Integer id, String info) {
		Person person = personService.selectById(id);
		person.setInfo(info);
		boolean flag = personService.update(person);
		if (flag) {
			return "redirect:showpersonlist.action";
		} else {
			return "404";
		}
	}

	/**
	 * 更改外来车辆备注信息
	 */
	@RequestMapping("/changecarinfo")
	public String changecarinfo(Integer id, String info) {
		Car car = carService.selectById(id);
		car.setInfo(info);
		boolean flag = carService.update(car);
		if (flag) {
			return "redirect:tovisitcarlist.action";
		} else {
			return "404";
		}
	}
}

package com.property.web;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.property.bean.Pay;
import com.property.bean.User;
import com.property.service.ChargeService;
import com.property.service.HouseService;
import com.property.service.PayService;
import com.property.service.UserService;
import com.property.vo.PayVO;
import com.property.vo.UserVO;

/**
 * @author 张延龙
 * @category 缴费控制器
 */
@Controller
public class PayController {
	@Autowired
	private PayService payService;
	@Autowired
	private UserService userService;

	@Autowired
	private HouseService houseService;
	@Autowired
	private ChargeService chargeService;

	@RequestMapping("/topay")
	public String towuyepay(Model model) {
		List<UserVO> userlist = userService.selectByRoId(2);
		model.addAttribute("userlist", userlist);
		return "paycreate";
	}

	/**
	 * @return
	 * @category 添加物业缴费
	 */
	@RequestMapping("/wuyepay")
	public String wuyepay() {
		List<UserVO> userlist = userService.selectByRoId(2);
		for (UserVO userVO : userlist) {
			Pay pay = new Pay();
			pay.setUid(userVO.getId());
			pay.setChargename("物业费");
			pay.setPayreal(0.0);
			pay.setPaystate(0);
			pay.setPaymonth((new Date().getMonth() + 1) + "");
			Double area = houseService.selectByHouseId(userVO.getHouseid()).getArea();// 房屋面积
			Double perm = chargeService.select(1).getChargeinfo();// 单价
			pay.setChargestandard(perm * area);// 面积乘以单价得到物业费
			payService.add(pay);
		}
		return "redirect:topay.action";
	}

	/**
	 * @param uid
	 * @param bulk
	 * @return
	 * @category 添加交水费
	 */
	@RequestMapping("/waterpay")
	public String waterpay(String uid, String bulk) {
		System.out.println("水费");
		Pay pay = new Pay();
		pay.setUid(Integer.valueOf(uid));
		pay.setChargename("水费");
		pay.setPayreal(0.0);
		pay.setPaystate(0);
		Double perm = chargeService.select(2).getChargeinfo();
		pay.setChargestandard(perm * Integer.valueOf(bulk));
		pay.setPaybalance(perm * Integer.valueOf(bulk));
		pay.setPaymonth((new Date().getMonth() + 1) + "");
		payService.add(pay);
		return "redirect:topay.action";
	}

	/**
	 * @param uid
	 * @param bulk
	 * @return
	 * @category 添加交电费
	 */
	@RequestMapping("/elcpay")
	public String elcpay(Integer uid, Integer bulk) {
		Pay pay = new Pay();
		pay.setChargename("电费");
		pay.setUid(uid);
		pay.setPayreal(0.0);
		pay.setPaystate(0);
		Double perm = chargeService.select(2).getChargeinfo();
		pay.setChargestandard(perm * bulk);
		pay.setPaybalance(perm * bulk);
		pay.setPaymonth((new Date().getMonth() + 1) + "");
		payService.add(pay);
		return "redirect:topay.action";
	}

	/**
	 * @param session
	 * @param model
	 * @return
	 * @category 查询我的缴费列表
	 */
	@RequestMapping("/mypay")
	public String mypay(HttpSession session, Model model) {
		User user = (User) session.getAttribute("current_user");
		List<PayVO> paylist = payService.selectByUserId(user.getId());
		model.addAttribute("paylist", paylist);
		return "mypaylist";
	}

	/**
	 * @param id
	 * @param payreal
	 * @return
	 * @category 业主缴费
	 */
	@RequestMapping("/pay")
	public String pay(String id, String payreal) {
		Pay pay = (Pay) payService.selectById(Integer.valueOf(id));
		Double real = Double.valueOf(payreal);
		pay.setPayreal(real);
		pay.setPaybalance(pay.getChargestandard() - real);
		if(pay.getPaybalance()==0||pay.getPaybalance()==0.0){
			pay.setPaystate(1);
		}
		payService.update(pay);
		return "redirect:mypay.action";
	}

}

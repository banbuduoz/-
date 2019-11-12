package com.property.vo;

import java.sql.Timestamp;

public class CarVO {
	/**
	 * 车辆出入管理编号
	 */
	private Integer id;
	/**
	 * 车牌号
	 */
	private String carnum;
	/**
	 * 入区时间
	 */
	private Timestamp intime;
	/**
	 * 离开时间
	 */
	private Timestamp outtime;
	/**
	 * 付款金额
	 */
	private Double pay;
	/**
	 * 备注信息
	 */
	private String info;
	/**
	 * 操作人员编号
	 */
	private Integer uid;

	/**
	 * 业主姓名
	 */
	private String uName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCarnum() {
		return carnum;
	}

	public void setCarnum(String carnum) {
		this.carnum = carnum;
	}

	public Timestamp getIntime() {
		return intime;
	}

	public void setIntime(Timestamp intime) {
		this.intime = intime;
	}

	public Timestamp getOuttime() {
		return outtime;
	}

	public void setOuttime(Timestamp outtime) {
		this.outtime = outtime;
	}

	public Double getPay() {
		return pay;
	}

	public void setPay(Double pay) {
		this.pay = pay;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public CarVO(Integer id, String carnum, Timestamp intime, Timestamp outtime, Double pay, String info, Integer uid,
			String uName) {
		super();
		this.id = id;
		this.carnum = carnum;
		this.intime = intime;
		this.outtime = outtime;
		this.pay = pay;
		this.info = info;
		this.uid = uid;
		this.uName = uName;
	}

	public CarVO() {
		super();
	}

}

package com.property.bean;

import java.sql.Timestamp;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author CJF
 * @category 车辆出入管理实体类
 */
public class Car {
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
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	private Timestamp intime;
	/**
	 * 离开时间
	 */
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
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

	public Car() {
		super();
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", carnum=" + carnum + ", intime=" + intime + ", outtime=" + outtime + ", pay=" + pay
				+ ", info=" + info + ", uid=" + uid + "]";
	}

	public Car(Integer id, String carnum, Timestamp intime, Timestamp outtime, Double pay, String info, Integer uid) {
		super();
		this.id = id;
		this.carnum = carnum;
		this.intime = intime;
		this.outtime = outtime;
		this.pay = pay;
		this.info = info;
		this.uid = uid;
	}

	public Car(String carnum, Timestamp intime, Timestamp outtime, Double pay, String info, Integer uid) {
		super();
		this.carnum = carnum;
		this.intime = intime;
		this.outtime = outtime;
		this.pay = pay;
		this.info = info;
		this.uid = uid;
	}

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
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	public Timestamp getIntime() {
		return intime;
	}

	public void setIntime(Timestamp intime) {
		this.intime = intime;
	}

	public Timestamp getOuttime() {
		return outtime;
	}
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
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

}

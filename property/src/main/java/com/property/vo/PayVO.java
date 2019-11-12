package com.property.vo;

import java.sql.Timestamp;

public class PayVO {

	/**
	 * 缴费表编号
	 */
	private Integer id;
	/**
	 * 缴费名称
	 */
	private String chargename;
	/**
	 * 缴费用户编号
	 */
	private Integer uid;
	/**
	 * 缴费状态（0:未交费,1:已缴费）
	 */
	private Integer paystate;
	/**
	 * 应缴费金额
	 */
	private Double chargestandard;
	/**
	 * 实际缴费金额
	 */
	private Double payreal;
	/**
	 * 欠费金额
	 */
	private Double paybalance;
	/**
	 * 缴费时间
	 */
	private Timestamp chargetime;
	/**
	 * 缴费月份
	 */
	private String paymonth;

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

	public String getChargename() {
		return chargename;
	}

	public void setChargename(String chargename) {
		this.chargename = chargename;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getPaystate() {
		return paystate;
	}

	public void setPaystate(Integer paystate) {
		this.paystate = paystate;
	}

	public Double getChargestandard() {
		return chargestandard;
	}

	public void setChargestandard(Double chargestandard) {
		this.chargestandard = chargestandard;
	}

	public Double getPayreal() {
		return payreal;
	}

	public void setPayreal(Double payreal) {
		this.payreal = payreal;
	}

	public Double getPaybalance() {
		return paybalance;
	}

	public void setPaybalance(Double paybalance) {
		this.paybalance = paybalance;
	}

	public Timestamp getChargetime() {
		return chargetime;
	}

	public void setChargetime(Timestamp chargetime) {
		this.chargetime = chargetime;
	}

	public String getPaymonth() {
		return paymonth;
	}

	public void setPaymonth(String paymonth) {
		this.paymonth = paymonth;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public PayVO(Integer id, String chargename, Integer uid, Integer paystate, Double chargestandard, Double payreal,
			Double paybalance, Timestamp chargetime, String paymonth, String uName) {
		super();
		this.id = id;
		this.chargename = chargename;
		this.uid = uid;
		this.paystate = paystate;
		this.chargestandard = chargestandard;
		this.payreal = payreal;
		this.paybalance = paybalance;
		this.chargetime = chargetime;
		this.paymonth = paymonth;
		this.uName = uName;
	}

	public PayVO() {
		super();
	}

}

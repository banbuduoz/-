package com.property.bean;

import java.sql.Timestamp;

/**
 * @author CJF
 * @category 外来人员出入管理表
 */
public class Person {
	/**
	 * 外来人员出入表编号
	 */
	private Integer id;
	/**
	 * 外来人员姓名
	 */
	private String name;
	/**
	 * 电话
	 */
	private String tel;
	/**
	 * 入区时间
	 */
	private Timestamp intime;
	/**
	 * 离开时间
	 */
	private Timestamp outtime;
	/**
	 * 拜访业主姓名
	 */
	private String visitname;
	/**
	 * 备注信息
	 */
	private String info;
	/**
	 * 操作人员编号
	 */
	private Integer uid;

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", tel=" + tel + ", intime=" + intime + ", outtime=" + outtime
				+ ", visitname=" + visitname + ", info=" + info + ", uid=" + uid + "]";
	}

	public Person() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
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

	public String getVisitname() {
		return visitname;
	}

	public void setVisitname(String visitname) {
		this.visitname = visitname;
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

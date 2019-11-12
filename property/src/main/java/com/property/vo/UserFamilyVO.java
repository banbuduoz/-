package com.property.vo;

import com.property.bean.UserFamily;

public class UserFamilyVO{

	

	/**
	 * 家庭成员id
	 */
	private Integer id;
	
	/**
	 * 家庭成员名字
	 */
	private String name;
	/**
	 * 性别
	 */
	private Character sex;
	/**
	 * 电话
	 */
	private String tel;
	/**
	 * 与业主关系
	 */
	private String relation;
	/**
	 * 业主id
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Character getSex() {
		return sex;
	}

	public void setSex(Character sex) {
		this.sex = sex;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
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

	
	
	public UserFamilyVO() {
		super();
	}

	public UserFamilyVO(Integer id, String name, Character sex, String tel, String relation, Integer uid,
			String uName) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.tel = tel;
		this.relation = relation;
		this.uid = uid;
		this.uName = uName;
	}
	
	
}

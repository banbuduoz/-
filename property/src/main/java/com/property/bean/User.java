package com.property.bean;

import java.sql.Timestamp;

/**
 * @author 张延龙
 * @category 用户类
 *
 */
public class User {
	/**
	 * 用户id
	 */
	private Integer id;

	/**
	 * 用户名字
	 */
	private String name;

	/**
	 * 用户账户登录名
	 */
	private String loginname;

	/**
	 * 登录密码
	 */
	private String pass;
	/**
	 * 用户电话
	 */
	private String tel;

	/**
	 * 用户性别
	 */
	private Character sex;

	/**
	 * 房产证照片
	 */
	private String buildingurl;
	/**
	 * 注册时间
	 */
	private Timestamp inputdate;
	/**
	 * 注册ip
	 */
	private String ip;
	/**
	 * 年龄
	 */
	private Integer age;
	/**
	 * 单元id
	 */
	private Integer houseid;
	/**
	 * 房间号
	 */
	private Integer roomid;
	/**
	 * 角色id
	 */
	private Integer roleid;
	/**
	 * 用户头像
	 */
	private String userurl;

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", loginname=" + loginname + ", pass=" + pass + ", tel=" + tel
				+ ", sex=" + sex + ", buildingurl=" + buildingurl + ", inputdate=" + inputdate + ", ip=" + ip + ", age="
				+ age + ", houseid=" + houseid + ", roomid=" + roomid + ", roleid=" + roleid + ", userurl=" + userurl
				+ "]";
	}

	public User(String name, String loginname, String pass, String tel, Character sex, String buildingurl,
			Timestamp inputdate, String ip, Integer age, Integer houseid, Integer roomid, Integer roleid,
			String userurl) {
		super();
		this.name = name;
		this.loginname = loginname;
		this.pass = pass;
		this.tel = tel;
		this.sex = sex;
		this.buildingurl = buildingurl;
		this.inputdate = inputdate;
		this.ip = ip;
		this.age = age;
		this.houseid = houseid;
		this.roomid = roomid;
		this.roleid = roleid;
		this.userurl = userurl;
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

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Character getSex() {
		return sex;
	}

	public void setSex(Character sex) {
		this.sex = sex;
	}

	public String getBuildingurl() {
		return buildingurl;
	}

	public void setBuildingurl(String buildingurl) {
		this.buildingurl = buildingurl;
	}

	public Timestamp getInputdate() {
		return inputdate;
	}

	public void setInputdate(Timestamp inputdate) {
		this.inputdate = inputdate;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getHouseid() {
		return houseid;
	}

	public void setHouseid(Integer houseid) {
		this.houseid = houseid;
	}

	public Integer getRoomid() {
		return roomid;
	}

	public void setRoomid(Integer roomid) {
		this.roomid = roomid;
	}

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public String getUserurl() {
		return userurl;
	}

	public void setUserurl(String userurl) {
		this.userurl = userurl;
	}

}

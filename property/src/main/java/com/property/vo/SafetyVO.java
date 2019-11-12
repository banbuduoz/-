package com.property.vo;

import java.sql.Timestamp;

public class SafetyVO {
	/**
	 * 职位名字
	 */
	private String kname;
	/**
	 * 用户名字
	 */
	private String uname;
	/**
	 * 安保id
	 */
	private Integer id;
	/**
	 * 安保类型id
	 */
	private Integer safekid;
	/**
	 * 开始时间
	 */
	private Timestamp starttime;
	/**
	 * 结束时间
	 */
	private Timestamp endtime;
	/**
	 * 备注
	 */
	private String info;
	/**
	 * 用户ID
	 */
	private Integer uid;

	public SafetyVO() {
		super();

	}

	public SafetyVO(String kname, String uname, Integer id, Integer safekid, Timestamp starttime, Timestamp endtime,
			String info, Integer uid) {
		super();
		this.kname = kname;
		this.uname = uname;
		this.id = id;
		this.safekid = safekid;
		this.starttime = starttime;
		this.endtime = endtime;
		this.info = info;
		this.uid = uid;
	}

	public String getKname() {
		return kname;
	}

	public void setKname(String kname) {
		this.kname = kname;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSafekid() {
		return safekid;
	}

	public void setSafekid(Integer safekid) {
		this.safekid = safekid;
	}

	public Timestamp getStarttime() {
		return starttime;
	}

	public void setStarttime(Timestamp starttime) {
		this.starttime = starttime;
	}

	public Timestamp getEndtime() {
		return endtime;
	}

	public void setEndtime(Timestamp endtime) {
		this.endtime = endtime;
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

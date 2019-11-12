package com.property.vo;

import java.sql.Timestamp;

public class ServiceVO {

	/**
	 * 申请id
	 */
	private Integer id;
	/**
	 * 服务名称
	 */
	private String title;
	/**
	 * 服务信息
	 */
	private String info;
	/**
	 * 申请用户id
	 */
	private Integer uid;
	/**
	 * 审判状态
	 */
	private Integer sid;
	/**
	 * 发起时间
	 */
	private Timestamp starttime;
	/**
	 * 结束时间
	 */
	private Timestamp endtime;
	/**
	 * 评价
	 */
	private String appraise;
	/**
	 * 申请服务类型
	 */
	private Integer kindid;
	/**
	 * 服务结果
	 */
	private String result;

	/**
	 * 业主名字
	 */
	private String uName;

	/**
	 * 状态名
	 */
	private String sName;
	
	/**
	 * 安全类型名
	 */
	private String kName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
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

	public String getAppraise() {
		return appraise;
	}

	public void setAppraise(String appraise) {
		this.appraise = appraise;
	}

	public Integer getKindid() {
		return kindid;
	}

	public void setKindid(Integer kindid) {
		this.kindid = kindid;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}


	public String getkName() {
		return kName;
	}

	public void setkName(String kName) {
		this.kName = kName;
	}

	public ServiceVO() {
		super();
	}

	public ServiceVO(Integer id, String title, String info, Integer uid, Integer sid, Timestamp starttime,
			Timestamp endtime, String appraise, Integer kindid, String result, String uName, String sName,
			String kName) {
		super();
		this.id = id;
		this.title = title;
		this.info = info;
		this.uid = uid;
		this.sid = sid;
		this.starttime = starttime;
		this.endtime = endtime;
		this.appraise = appraise;
		this.kindid = kindid;
		this.result = result;
		this.uName = uName;
		this.sName = sName;
		this.kName = kName;
	}

	
}

package com.property.vo;

import java.sql.Timestamp;

public class BlogVO {
	/**
	 * 博客编号
	 */
	private Integer id;
	/**
	 * 博客类型编号
	 */
	private Integer kid;
	/**
	 * 用户编号
	 */
	private Integer uid;
	/**
	 * 题目
	 */
	private String title;
	/**
	 * 内容
	 */
	private String content;
	/**
	 * 发起时间
	 */
	private Timestamp datetime;
	
	/**
	 * 博客类型名称
	 */
	private String kindName;
	
	/**
	 * 用户名称
	 */
	private String userName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getKid() {
		return kid;
	}

	public void setKid(Integer kid) {
		this.kid = kid;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getDatetime() {
		return datetime;
	}

	public void setDatetime(Timestamp datetime) {
		this.datetime = datetime;
	}

	public String getKindName() {
		return kindName;
	}

	public void setKindName(String kindName) {
		this.kindName = kindName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public BlogVO(Integer id, Integer kid, Integer uid, String title, String content, Timestamp datetime,
			String kindName, String userName) {
		super();
		this.id = id;
		this.kid = kid;
		this.uid = uid;
		this.title = title;
		this.content = content;
		this.datetime = datetime;
		this.kindName = kindName;
		this.userName = userName;
	}

	public BlogVO() {
		super();
	}

	public BlogVO(Integer id, Integer kid, Integer uid, String title, String content, Timestamp datetime) {
		super();
		this.id = id;
		this.kid = kid;
		this.uid = uid;
		this.title = title;
		this.content = content;
		this.datetime = datetime;
	}
	
	
}

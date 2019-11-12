package com.property.bean;

import java.sql.Timestamp;

/**
 * @author CJF
 * @category 博客实体类
 */
public class Blog {
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

	public Blog() {
		super();
	}

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

}

package com.property.vo;

public class CommentVO {
	/**
	 * 评论编号
	 */
	private Integer id;
	/**
	 * 评论用户编号
	 */
	private Integer uid;
	/**
	 * 评论博客编号
	 */
	private Integer bid;
	/**
	 * 评论发布ip
	 */
	private String ip;
	/**
	 * 评论内容
	 */
	private String content;

	/**
	 * 评论人姓名
	 */
	private String userName;

	public CommentVO(Integer id, Integer uid, Integer bid, String ip, String content) {
		super();
		this.id = id;
		this.uid = uid;
		this.bid = bid;
		this.ip = ip;
		this.content = content;
	}

	public CommentVO(Integer id, Integer uid, Integer bid, String ip, String content, String userName) {
		super();
		this.id = id;
		this.uid = uid;
		this.bid = bid;
		this.ip = ip;
		this.content = content;
		this.userName = userName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public CommentVO() {
		super();
	}
}

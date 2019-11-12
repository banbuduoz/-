package com.property.bean;

/**
 * @author CJF
 * @category 评论表
 */
public class Comment {
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

	public Comment() {
		super();
	}
	

	public Comment(Integer uid, Integer bid, String ip, String content) {
		super();
		this.uid = uid;
		this.bid = bid;
		this.ip = ip;
		this.content = content;
	}


	public Comment(Integer id, Integer uid, Integer bid, String ip, String content) {
		super();
		this.id = id;
		this.uid = uid;
		this.bid = bid;
		this.ip = ip;
		this.content = content;
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
}

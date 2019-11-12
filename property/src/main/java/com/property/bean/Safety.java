package com.property.bean;

import java.sql.Timestamp;

/**
 * @author 张延龙
 * @category 安保
 *
 */
public class Safety {
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
	public void setEndtime(Timestamp endtimne) {
		this.endtime = endtimne;
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
	public Safety(Integer safekid, Timestamp starttime, Timestamp endtimne, String info, Integer uid) {
		super();
		this.safekid = safekid;
		this.starttime = starttime;
		this.endtime = endtimne;
		this.info = info;
		this.uid = uid;
	}
	public Safety() {
		super();
	}
	public Safety(Integer id, Integer safekid, Timestamp starttime, Timestamp endtime, String info, Integer uid) {
		super();
		this.id = id;
		this.safekid = safekid;
		this.starttime = starttime;
		this.endtime = endtime;
		this.info = info;
		this.uid = uid;
	}
	

}

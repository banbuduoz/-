package com.property.bean;

/**
 * @author 张延龙
 * @category 房屋
 *
 */
public class Room {
	/**
	 * 房屋id
	 */
	private Integer id;
	/**
	 * 房屋名称，房间号
	 */
	private String name;
	/**
	 * 单元楼id
	 */
	private Integer hid;
	/**
	 * 用户id
	 */
	private Integer uid;
	/**
	 * 房屋面积
	 */
	private Double area;
	/**
	 * 业主名称
	 */
	private String uname;
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
	public Integer getHid() {
		return hid;
	}
	public void setHid(Integer hid) {
		this.hid = hid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Room(String name, Integer hid, Integer uid, Double area, String uname) {
		super();
		this.name = name;
		this.hid = hid;
		this.uid = uid;
		this.area = area;
		this.uname = uname;
	}
	public Room() {
		super();
	}

}

package com.property.bean;

import java.sql.Date;

/**
 * @author CJF
 * @category 单元楼实体类
 */
public class House {
	/**
	 * 单元楼编号
	 */
	private Integer id;
	/**
	 * 单元楼名称
	 */
	private String name;
	/**
	 * 动工时间
	 */
	private Date buildstarttime;
	/**
	 * 竣工时间
	 */
	private Date buildendtime;
	/**
	 * 建筑面积
	 */
	private Double area;
	/**
	 * 备注信息
	 */
	private String info;

	public House() {
		super();
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

	public Date getBuildstarttime() {
		return buildstarttime;
	}

	public void setBuildstarttime(Date buildstarttime) {
		this.buildstarttime = buildstarttime;
	}

	public Date getBuildendtime() {
		return buildendtime;
	}

	public void setBuildendtime(Date buildendtime) {
		this.buildendtime = buildendtime;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}

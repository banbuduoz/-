package com.property.bean;

/**
 * @author CJF
 * @category 收费标准表
 */
public class Charge {
	/**
	 * 收费标准编号
	 */
	private Integer id;
	/**
	 * 收费类型名称
	 */
	private String name;
	/**
	 * 收费金额
	 */
	private Double chargeinfo;

	public Charge() {
		super();
	}

	public Charge(Integer id, String name, Double chargeinfo) {
		super();
		this.id = id;
		this.name = name;
		this.chargeinfo = chargeinfo;
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

	public Double getChargeinfo() {
		return chargeinfo;
	}

	public void setChargeinfo(Double chargeinfo) {
		this.chargeinfo = chargeinfo;
	}

}

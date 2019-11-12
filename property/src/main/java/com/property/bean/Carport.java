package com.property.bean;

/**
 * @author CJF
 * @category 停车位表
 */
public class Carport {
	/**
	 * 车位总数
	 */
	private Integer total;
	/**
	 * 已停车数
	 */
	private Integer number;

	public Carport() {
		super();
	}
	

	public Carport(Integer total, Integer number) {
		super();
		this.total = total;
		this.number = number;
	}


	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

}

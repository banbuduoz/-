package com.property.bean;

/**
 * @author 张延龙
 * @category 状态表
 *
 */
public class State {
	/**
	 * 状态id
	 */
	private Integer id;
	/**
	 * 状态名称
	 */
	private String name;
	public State(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public State() {
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
	
}

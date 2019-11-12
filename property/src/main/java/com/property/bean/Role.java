package com.property.bean;

/**
 * @author CJF
 * @category 角色表实体类
 */
public class Role {
	/**
	 * 角色编号
	 */
	private Integer id;
	/**
	 * 角色名称
	 */
	private String name;

	public Role() {
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

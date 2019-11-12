package com.property.bean;

/**
 * @author CJF
 * @category 服务类型表
 */
public class ServiceKind {
	/**
	 * 服务类型编号
	 */
	private Integer id;
	/**
	 * 服务类型名称
	 */
	private String name;

	public ServiceKind() {
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

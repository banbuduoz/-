package com.property.bean;

/**
 * @author zyl
 * @category 安全类型
 *
 */
public class SafeKind {
	/**
	 * 安检类型id
	 */
	private Integer id;
	/**
	 * 安全检查类型
	 */
	private String name;

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

	public SafeKind(String name) {
		super();
		this.name = name;
	}

	public SafeKind() {
		super();
	}

}

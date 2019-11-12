package com.property.bean;

/**
 * @author CJF
 * @category 博客类型实体类
 */
public class BlogKind {
	/**
	 * 博客类型编号
	 */
	private Integer id;
	/**
	 * 博客类型名称
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
	public BlogKind() {
		super();
	}
	public BlogKind(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}

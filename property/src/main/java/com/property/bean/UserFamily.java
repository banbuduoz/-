package com.property.bean;

/**
 * @author 张延龙
 * @category 业主家庭成员类
 *
 */
public class UserFamily {
	/**
	 * 家庭成员id
	 */
	private Integer id;
	/**
	 * 家庭成员名字
	 */
	private String name;
	/**
	 * 性别
	 */
	private Character sex;
	/**
	 * 电话
	 */
	private String tel;
	/**
	 * 与业主关系
	 */
	private String relation;
	/**
	 * 业主id
	 */
	private Integer uid;

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

	public Character getSex() {
		return sex;
	}

	public void setSex(Character sex) {
		this.sex = sex;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public UserFamily() {
		super();
	}

	public UserFamily(String name, Character sex, String tel, String relation, Integer uid) {
		super();
		this.name = name;
		this.sex = sex;
		this.tel = tel;
		this.relation = relation;
		this.uid = uid;
	}

}

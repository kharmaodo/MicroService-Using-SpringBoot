package com.example.billservice.bean;

public class Billing {

	private String id;
	private String name;
	private String desc;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Billing() {
		super();
	}

	public Billing(String id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Billing [id=" + id + ", name=" + name + ", desc=" + desc + "]";
	}

}

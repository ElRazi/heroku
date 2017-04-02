package com.example;

public class TestBean {
	private String name;
	private Boolean flag;
	
	public TestBean() {
	}
	
	public TestBean(String name, Boolean flag) {
		super();
		this.name = name;
		this.flag = flag;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getFlag() {
		return flag;
	}
	public void setFlag(Boolean flag) {
		this.flag = flag;
	}
}

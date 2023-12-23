package com.beans.beanspkg;

public class StudentBean {
	String name;
	String pwd;
	public StudentBean()
	{
		System.out.println("...initialized.......");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println(".........."+name);
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}

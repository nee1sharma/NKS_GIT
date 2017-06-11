package com.sharma.nks.spbo.beans;

public class Student {

	private String sid;
	private int roleNumber;	
	private String firstName;
	private String lastName;
	private String clas;
	private String section;
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public int getRoleNumber() {
		return roleNumber;
	}
	public void setRoleNumber(int roleNumber) {
		this.roleNumber = roleNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public Student(String sid, int roleNumber, String firstName, String lastName, String clas, String section) {
		super();
		this.sid = sid;
		this.roleNumber = roleNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.clas = clas;
		this.section = section;
	}
	
	
}

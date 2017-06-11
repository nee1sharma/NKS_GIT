package com.sharma.nk.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TABLE_CREDENTIALS")
public class CredentialsBean {
	
	@Id
	@Column(name="user_id",length=50,nullable=false)
	private String userId;
	
	@Column(name="password",length=50,nullable=false)
	private String password;
	//for default value columnDefinition="boolean default false"
	@Column(name="login_status")
	private boolean loginStatus;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isStatus() {
		return loginStatus;
	}
	public void setStatus(boolean loginStatus) {
		this.loginStatus = loginStatus;
	}
	
	
}

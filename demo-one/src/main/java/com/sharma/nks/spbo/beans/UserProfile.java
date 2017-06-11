package com.sharma.nks.spbo.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="TABLE_USER")
public class UserProfile {
	
	@Id
	@Column(name="user_id", length=50)
	private String userId;
	@Column(name="user_name", length=50)
	private String userName;
	
	@Column(name="email_d",length=50)
	private String emailId;
	
	@Column(name="created_on", length=20)
	private Date createdDate;

	@Column(name="modified_on", length=20)
	private Date modifiedDate;

	@Column(name="created_by", length=50)
	private String createdBy;

	@Column(name="modified_by", length=50)
	private String modifiedBy;
	
	@Transient
	private AuthorizationBean currentAuth;
	@Transient
	private AuthorizationBean previousAuth;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public AuthorizationBean getCurrentAuth() {
		return currentAuth;
	}
	public void setCurrentAuth(AuthorizationBean currentAuth) {
		this.currentAuth = currentAuth;
	}
	public AuthorizationBean getPreviousAuth() {
		return previousAuth;
	}
	public void setPreviousAuth(AuthorizationBean previousAuth) {
		this.previousAuth = previousAuth;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}

package com.sharma.nk.models;

import java.util.List;
import java.util.Map;

/**
 * Role based ACL need to be implemented here. RBACL is listed in separate file instead of DB.
 * @author Heavens <br/>
 * @since: Dec 8, 2016
 */
public class AuthorizationBean {

	private String role;
	private List<String> aclList;
	//private String privileges;
	//acl<role,aclList>
	private Map<String, List<String>> acl;
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<String> getAclList() {
		return aclList;
	}
	public void setAclList(List<String> aclList) {
		this.aclList = aclList;
	}
	public Map<String, List<String>> getAcl() {
		return acl;
	}
	public void setAcl(Map<String, List<String>> acl) {
		this.acl = acl;
	}
		
}

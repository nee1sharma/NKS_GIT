package com.sharma.nks.spbo.beans.requests;

import com.sharma.nks.spbo.beans.CredentialsBean;

public class AuthenticationRequest {
	private CredentialsBean credentials;

	public CredentialsBean getCredentials() {
		return credentials;
	}

	public void setCredentials(CredentialsBean credentials) {
		this.credentials = credentials;
	}
}

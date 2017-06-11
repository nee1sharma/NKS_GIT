package com.sharma.nk.models.requests;

import com.sharma.nk.models.CredentialsBean;

public class AuthenticationRequest {
	private CredentialsBean credentials;

	public CredentialsBean getCredentials() {
		return credentials;
	}

	public void setCredentials(CredentialsBean credentials) {
		this.credentials = credentials;
	}
}

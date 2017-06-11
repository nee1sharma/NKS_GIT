package com.sharma.nk.transformers;

import com.sharma.nk.models.CredentialsBean;
import com.sharma.nk.models.requests.AuthenticationRequest;
import com.sharma.nk.models.requests.CreateUserProfileRequest;

public class CredentialsTransformer {
	
	public CredentialsBean transform(AuthenticationRequest req){
		return req.getCredentials();
	}

}

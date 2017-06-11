package com.sharma.nk.validators;

import com.sharma.nk.models.requests.AuthenticationRequest;
import com.sharma.nk.models.requests.CreateUserProfileRequest;

public class CredentialValidations extends BaseRequestValidation{
	
	public boolean isValidInputString(AuthenticationRequest req) {
		 boolean a=isValidInputString(req.getCredentials().getUserId());
		 boolean b=isValidInputString(req.getCredentials().getPassword());
				 
		 return a && b;
	}
	
}

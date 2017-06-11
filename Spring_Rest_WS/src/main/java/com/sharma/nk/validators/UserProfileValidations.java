package com.sharma.nk.validators;

import com.sharma.nk.models.requests.CreateUserProfileRequest;

public class UserProfileValidations extends BaseRequestValidation{
	
	public boolean isValidEmail(CreateUserProfileRequest req) {
		return isValidEmail(req.getUserProfile().getEmailId());
	}

	public boolean isValidEmailAndInputString(CreateUserProfileRequest req) {
		 boolean a=isValidInputString(req.getUserProfile().getUserId());
		 boolean b=isValidEmail(req.getUserProfile().getEmailId());
				 
		 return a && b;
	}
}

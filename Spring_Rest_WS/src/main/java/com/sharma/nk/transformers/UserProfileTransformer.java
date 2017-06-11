package com.sharma.nk.transformers;

import com.sharma.nk.models.UserProfile;
import com.sharma.nk.models.requests.CreateUserProfileRequest;

public class UserProfileTransformer {

	public UserProfile transform(CreateUserProfileRequest req){
		return req.getUserProfile();
	}
}

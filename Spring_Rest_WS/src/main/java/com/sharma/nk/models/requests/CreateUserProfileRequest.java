package com.sharma.nk.models.requests;

import com.sharma.nk.models.BaseRequest;
import com.sharma.nk.models.UserProfile;

public class CreateUserProfileRequest extends BaseRequest{
	
	private UserProfile userProfile;

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}
	
}

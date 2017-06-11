package com.sharma.nks.spbo.beans.requests;

import com.sharma.nks.spbo.beans.BaseRequest;
import com.sharma.nks.spbo.beans.UserProfile;

public class CreateUserProfileRequest extends BaseRequest{
	
	private UserProfile userProfile;

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}
	
}

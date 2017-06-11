package com.sharma.nk.models.requests;

import com.sharma.nk.models.BaseResponse;
import com.sharma.nk.models.UserProfile;

/**
 * 
 * @author Heavens<br/> 
 * @since: Dec 14, 2016
 */
public class CreateUserProfileResponse extends BaseResponse{
	
	private UserProfile userProfile;

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}
	
}

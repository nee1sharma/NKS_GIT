package com.sharma.nks.spbo.beans.requests;

import com.sharma.nks.spbo.beans.BaseResponse;
import com.sharma.nks.spbo.beans.UserProfile;

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

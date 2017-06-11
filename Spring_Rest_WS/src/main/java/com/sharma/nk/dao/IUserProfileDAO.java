package com.sharma.nk.dao;

import com.sharma.nk.models.ResponseCode;
import com.sharma.nk.models.UserProfile;
import com.sharma.nk.models.requests.CreateUserProfileRequest;
import com.sharma.nk.models.requests.CreateUserProfileResponse;
import com.sharma.nk.utils.TechnicalException;

public interface IUserProfileDAO {
	/**
	 * 
	 * @param UserProfile : profile
	 * @return 000 if success
	 */
	public ResponseCode addNewUser(CreateUserProfileRequest userProfileRequest)throws TechnicalException;
	
	/**
	 * @param UserProfile : profile
	 * @return 000 if success
	 */
	public String updateUserProfile(UserProfile profile)throws TechnicalException;
	
	/**
	 * @param userId : unique userId
	 * @return 000 if success
	 */
	public String deleteUserProfile(String userId)throws TechnicalException;
	
	/**
	 * @param userId : unique userId
	 * @return UserProfile : userName
	 */
	public UserProfile findUserById(String userId)throws TechnicalException;
}

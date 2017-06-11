package com.sharma.nks.spbo.dao;

import com.sharma.nks.spbo.beans.ResponseCode;
import com.sharma.nks.spbo.beans.UserProfile;
import com.sharma.nks.spbo.beans.requests.CreateUserProfileRequest;
import com.sharma.nks.spbo.utils.TechnicalException;

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

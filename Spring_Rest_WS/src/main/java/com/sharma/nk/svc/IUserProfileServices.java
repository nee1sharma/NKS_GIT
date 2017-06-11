package com.sharma.nk.svc;

import javax.jws.WebService;

import com.sharma.nk.models.UserProfile;
import com.sharma.nk.models.requests.CreateProductRequest;
import com.sharma.nk.models.requests.CreateUserProfileRequest;
import com.sharma.nk.models.requests.CreateUserProfileResponse;
import com.sharma.nk.utils.TechnicalException;
import com.sharma.nk.utils.ValidationException;

/**
 * 
 * @author Heavens<br/> 
 * @since: Dec 14, 2016
 */
@WebService(name="profileWS")
public interface IUserProfileServices {
	/**
	 * 
	 * @param CreateUserProfileRequest : createUserProfileRequest
	 * @return 000 if success
	 */
	public CreateUserProfileResponse addNewUser(CreateUserProfileRequest createUserProfileRequest) throws ValidationException,TechnicalException;
	
	/**
	 * @param UserProfile : profile
	 * @return 000 if success
	 */
	public String updateUserProfile(UserProfile profile)throws ValidationException,TechnicalException;
	
	/**
	 * @param userId : unique userId
	 * @return 000 if success
	 */
	public String deleteUserProfile(String userId)throws ValidationException,TechnicalException;
	
	/**
	 * @param userId : unique userId
	 * @return UserProfile : userName
	 */
	public UserProfile findUserById(String userId)throws ValidationException,TechnicalException;
}

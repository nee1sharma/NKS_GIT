package com.sharma.nk.svc;

import javax.jws.WebService;

import com.sharma.nk.models.CredentialsBean;
import com.sharma.nk.models.requests.AuthenticationRequest;
import com.sharma.nk.utils.TechnicalException;


/**
 * @author Heavens<br/> 
 * @since: Dec 8, 2016
 */
@WebService(name="credWS")
public interface ICredentialServices {

	/**
	 * Authentication deals with user account validation. Is user registered in application.
	 * @param credentialsBean : userId and password
	 * @return true : credentials matched
	 * @throws TechnicalException
	 */
	public boolean authenticate(AuthenticationRequest authenticationRequest) throws TechnicalException;
	
	/**
	 * @param userId : User logged in status will be set to false.
	 * @param isLoggedIn : set to false when logout
	 * @return true: successful logout status false set
	 * @throws TechnicalException
	 */
	public boolean logout(String userId)throws TechnicalException;
	
	/** 
	 * Authorization deals with user access validation to certain feature. 
	 * @param authorizationBean : role 
	 * @return true : ACL found for role
	 */
	public boolean authorize(String role)throws TechnicalException;
	
	
}

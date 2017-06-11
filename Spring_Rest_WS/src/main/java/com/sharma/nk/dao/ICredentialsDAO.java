package com.sharma.nk.dao;

import com.sharma.nk.models.CredentialsBean;
import com.sharma.nk.models.ResponseCode;
import com.sharma.nk.models.requests.AuthenticationRequest;
import com.sharma.nk.utils.TechnicalException;

/**
 * 
 * @author Heavens<br/> 
 * @since: Dec 13, 2016
 */
public interface ICredentialsDAO {
	/**
	 * 
	 * @param credentialsBean : userId and password
	 * @return true if credentials found
	 * @throws TechnicalException
	 */
	public boolean authenticate(AuthenticationRequest credentialsBean) throws TechnicalException;
	
	public boolean authorize(String role) throws TechnicalException;
	
	
	/**
	 * 
	 * @param authenticationRequest : userId and password
	 * @return success : description; failure : errorCode
	 * @throws TechnicalException
	 */
	public ResponseCode addCredentials(AuthenticationRequest authenticationRequest) throws TechnicalException;
	
	public boolean updateCredentials(CredentialsBean credentialsBean) throws TechnicalException;
	

	/**
	 * @param userId : User logged in status will be set to false.
	 * @return true: successful logout 
	 * @throws TechnicalException
	 */
	public boolean logout(String userId) throws TechnicalException;
	
}

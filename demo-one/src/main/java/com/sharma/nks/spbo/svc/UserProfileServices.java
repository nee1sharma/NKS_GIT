package com.sharma.nks.spbo.svc;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharma.nks.spbo.dao.ICredentialsDAO;
import com.sharma.nks.spbo.dao.IUserProfileDAO;
import com.sharma.nks.spbo.beans.CredentialsBean;
import com.sharma.nks.spbo.beans.ResponseCode;
import com.sharma.nks.spbo.beans.UserProfile;
import com.sharma.nks.spbo.beans.requests.AuthenticationRequest;
import com.sharma.nks.spbo.beans.requests.CreateUserProfileRequest;
import com.sharma.nks.spbo.beans.requests.CreateUserProfileResponse;
import com.sharma.nks.spbo.utils.TechnicalException;
import com.sharma.nks.spbo.utils.ValidationException;

@Service
@WebService(endpointInterface="com.sharma.nks.spbo.svc.IUserProfileServices")
public class UserProfileServices implements IUserProfileServices{

	@Autowired
	private IUserProfileDAO userDAO;
		
	@Autowired
	private ICredentialsDAO credDao;
	
	public CreateUserProfileResponse addNewUser(CreateUserProfileRequest profileRequest) throws ValidationException,TechnicalException{
		if(null==profileRequest && null==profileRequest.getUserProfile()){
			throw new ValidationException("Null profile.");
		}
		profileRequest.getUserProfile().setUserId(profileRequest.getUserProfile().getUserName());
		ResponseCode responseCode= userDAO.addNewUser(profileRequest);
		
		CreateUserProfileResponse response=new CreateUserProfileResponse();
		
		CredentialsBean cb=new CredentialsBean();
		cb.setUserId(profileRequest.getUserProfile().getUserName());
		cb.setPassword(profileRequest.getUserProfile().getEmailId());
		AuthenticationRequest req=new AuthenticationRequest();
		req.setCredentials(cb);
		responseCode=credDao.addCredentials(req);

		response.setResponseCode(responseCode);
		
		return response;
	}

	public String updateUserProfile(UserProfile profile) throws ValidationException,TechnicalException{
		// TODO Auto-generated method stub
		return null;
	}

	
	public String deleteUserProfile(String userId) throws ValidationException,TechnicalException{
		// TODO Auto-generated method stub
		return null;
	}

	
	public UserProfile findUserById(String userId) throws ValidationException,TechnicalException{
		// TODO Auto-generated method stub
		return null;
	}

}

package com.sharma.nk.svc;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharma.nk.dao.ICredentialsDAO;
import com.sharma.nk.dao.IUserProfileDAO;
import com.sharma.nk.models.CredentialsBean;
import com.sharma.nk.models.ResponseCode;
import com.sharma.nk.models.UserProfile;
import com.sharma.nk.models.requests.AuthenticationRequest;
import com.sharma.nk.models.requests.CreateUserProfileRequest;
import com.sharma.nk.models.requests.CreateUserProfileResponse;
import com.sharma.nk.utils.TechnicalException;
import com.sharma.nk.utils.ValidationException;

@Service
@WebService(endpointInterface="com.sharma.nk.svc.IUserProfileServices")
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

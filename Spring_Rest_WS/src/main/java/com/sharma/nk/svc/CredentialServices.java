package com.sharma.nk.svc;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharma.nk.dao.ICredentialsDAO;
import com.sharma.nk.models.CredentialsBean;
import com.sharma.nk.models.requests.AuthenticationRequest;
import com.sharma.nk.utils.TechnicalException;

@Service
@WebService(endpointInterface="com.sharma.nk.svc.ICredentialServices")
public class CredentialServices implements ICredentialServices{

	@Autowired
	ICredentialsDAO credDao;
	public boolean authenticate(AuthenticationRequest authenticationRequest) throws TechnicalException{
		
		return credDao.authenticate(authenticationRequest);
	}

	public boolean authorize(String role) throws TechnicalException {
		return false;
	}

	public boolean logout(String userId) throws TechnicalException {
		return credDao.logout(userId);
	}

	
}

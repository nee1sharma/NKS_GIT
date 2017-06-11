package com.sharma.nks.spbo.svc;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharma.nks.spbo.dao.ICredentialsDAO;
import com.sharma.nks.spbo.beans.requests.AuthenticationRequest;
import com.sharma.nks.spbo.utils.TechnicalException;

@Service
@WebService(endpointInterface="com.sharma.nks.spbo.svc.ICredentialServices")
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

package com.sharma.nks.spbo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.sharma.nks.spbo.beans.ResponseCode;
import com.sharma.nks.spbo.beans.UserProfile;
import com.sharma.nks.spbo.utils.TechnicalException;

@Repository
public class UserProfileDAO  {

	private SessionFactory sessionFactory;
	private Session session;

	public ResponseCode addNewUser(UserProfile profile) throws TechnicalException {
		ResponseCode responseCode;
		sessionFactory = HBUtils.createSessionFactory();

		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(profile);
			session.getTransaction().commit();

		} catch (Exception ex) {
			System.out.println(ex);
			throw new TechnicalException(ex.getMessage());
		}
		finally{
			session.clear();
			sessionFactory.close();
		}
		responseCode = new ResponseCode();
		responseCode.setDesc("Added successfully"+profile);
		
		return responseCode;
	}

	public String updateUserProfile(UserProfile profile) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteUserProfile(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserProfile findUserById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}

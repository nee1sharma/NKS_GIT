package com.sharma.nks.spbo.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.stereotype.Repository;

import com.sharma.nks.spbo.beans.CredentialsBean;
import com.sharma.nks.spbo.beans.ResponseCode;
import com.sharma.nks.spbo.utils.TechnicalException;

@Repository
public class CredentialsDAO  {

	private final Logger logger=Logger.getLogger(getClass());
	private SessionFactory sessionFactory;
	private Session session;
	public boolean authenticate(CredentialsBean credentialsBean) throws TechnicalException{
		String sql_select="select CredentialsBean from CredentialsBean where userId=:q1 ";
		sessionFactory=HBUtils.createSessionFactory();
		session=sessionFactory.openSession();
		boolean loggedIn=false;
		List<CredentialsBean> userList=null;
		try{
			//Query query=session.createQuery(sql_select);
			//query.setString("q1", credentialsBean.getUserId());
			//query.setString("q2", credentialsBean.getPassword());
			//userList=query.list();
			
			CredentialsBean cb=(CredentialsBean)session.get(CredentialsBean.class, credentialsBean.getUserId());
			
			if(credentialsBean.getUserId().equals(cb.getUserId()) && credentialsBean.getPassword().equals(cb.getPassword())){
				loggedIn=updateLoggedInStatus(credentialsBean.getUserId(),true);
				if(!loggedIn){
					throw new TechnicalException("Login is not successful.");
				}
			}
		}catch(ConstraintViolationException cve){throw new TechnicalException(cve.getMessage());}
		catch(Exception ex){throw new TechnicalException(ex.getMessage());}
		finally{
			session.clear();
			sessionFactory.close();
		}
		
		return loggedIn;
	}

	public boolean authorize(String role) {

		return false;
	}

	public ResponseCode addCredentials(CredentialsBean credentialsBean)throws TechnicalException {

		ResponseCode responseCode=new ResponseCode();
		sessionFactory=HBUtils.createSessionFactory();
		session=sessionFactory.openSession();
		
		try{
			session.beginTransaction();
			session.save(credentialsBean);
			session.getTransaction().commit();
			responseCode.setDesc("Added successfully : "+credentialsBean);
		}catch(ConstraintViolationException cve){
			responseCode.setErrorCode("-601");
			responseCode.setDesc(cve.getMessage());
			throw new TechnicalException(cve.getMessage());
		}
		catch(Exception ex){
			responseCode.setErrorCode("-600");
			responseCode.setDesc(ex.getMessage());
			throw new TechnicalException(ex.getMessage());
		}

		session.clear();
		session.close();
		
		return responseCode;
	}

	public boolean updateCredentials(CredentialsBean credentialsBean) {

		return false;
	}

	private boolean updateLoggedInStatus(String userId,boolean isLoggedIn)throws TechnicalException {

		sessionFactory=HBUtils.createSessionFactory();
		session=sessionFactory.openSession();
		try{
			session.beginTransaction();
			//session.update(cb);
			//session.getTransaction().commit();

			Query query=session.createQuery("update CredentialsBean set loginStatus=:q1 where userId=:q2");
			query.setBoolean("q1", isLoggedIn);
			query.setString("q2", userId);
			int eu=query.executeUpdate();
			session.getTransaction().commit();

			//if updated successfully then 1
			logger.debug("Updated login status: "+eu);
			
			return true;
		}
		catch(Exception ex){ throw new TechnicalException(ex.getMessage());}
		finally {
			session.clear();
			sessionFactory.close();
		}
	}
	
	public boolean logout(String userId)throws TechnicalException{
		boolean b =updateLoggedInStatus(userId,false);

		return b;
	}
	

}

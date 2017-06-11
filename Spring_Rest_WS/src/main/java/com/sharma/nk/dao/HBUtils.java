package com.sharma.nk.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HBUtils {

	private static SessionFactory sessionFactory=null;
	private static ServiceRegistry serviceRegistry=null;
	
	public static SessionFactory createSessionFactory(){
		Configuration config=new Configuration();
		config.configure();
		serviceRegistry=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		sessionFactory=config.buildSessionFactory(serviceRegistry);
		return sessionFactory;
	}
	
	private static Session openSession(){
		return createSessionFactory().openSession();
	}
	
	private static void closeSession(Session session){
		session.flush();
		session.close();
		sessionFactory.close();
	}
}

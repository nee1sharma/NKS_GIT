package com.sharma.nks.spbo.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.stereotype.Repository;

import com.sharma.nks.spbo.beans.Product;
import com.sharma.nks.spbo.beans.ResponseCode;
import com.sharma.nks.spbo.beans.requests.CreateProductResponse;
import com.sharma.nks.spbo.beans.requests.RtrvProductListRequest;
import com.sharma.nks.spbo.beans.requests.RtrvProductListResponse;
import com.sharma.nks.spbo.utils.TechnicalException;

@Repository
public class ProductCalatogDAO {

	private final int RECORD_COUNT=4;
	
	private SessionFactory sessionFactory=null;
	private Session session=null;
	
	public RtrvProductListResponse getAllProductList(RtrvProductListRequest req) throws TechnicalException{
		RtrvProductListResponse response=null;
		List<Product> productList = null;

		sessionFactory=HBUtils.createSessionFactory();
		session=sessionFactory.openSession();
		//session=HBUtils.openSession();
		try{
			Iterator i=session.createQuery("select count(*) from Product").iterate();
			//System.out.println(i.next());
			Query qry=session.createQuery("from Product");
			qry.setMaxResults(RECORD_COUNT);
			qry.setFirstResult(RECORD_COUNT*req.getStart());
			productList=(List<Product>)qry.list();
			if(productList!=null){
				response=new RtrvProductListResponse();
				response.setTotalProducts(Integer.parseInt(i.next().toString()));
				response.setProductList(productList);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		finally{

			session.flush();
			sessionFactory.close();
			//HBUtils.closeSession(session);
		}
		return response;
	}

	
	public Product getProductById(String productId) throws TechnicalException{
		
		sessionFactory=HBUtils.createSessionFactory();
		session=sessionFactory.openSession();
		
		Product product=(Product) session.get(Product.class, productId);
		if(null==product){
			throw new TechnicalException("No product with productId: "+productId);
		}
		
		session.clear();
		sessionFactory.close();
		
		return product;
	}

	public CreateProductResponse addNewProduct(Product product) throws TechnicalException{
		
		sessionFactory=HBUtils.createSessionFactory();
		session=sessionFactory.openSession();
		ResponseCode code=new ResponseCode();

		try{
			session.beginTransaction();
			session.save(product.getInfo());
			session.save(product);
			session.getTransaction().commit();
			System.out.println("Product added-------------------------------------------------\n"+product.toString());
			code.setErrorCode("000");
		}catch (ConstraintViolationException cve) {
			System.out.println("Product Id already added."+cve.toString());
			code.setErrorCode("111");	
		}catch(Exception e){
		}
		finally{
			session.flush();
			sessionFactory.close();
		}
				
		CreateProductResponse response=new CreateProductResponse();
		
		response.setResponseCode(code);
		return response;
	}
}
package com.sharma.nks.spbo.svc;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.sharma.nks.spbo.beans.BaseResponse;
import com.sharma.nks.spbo.beans.Product;
import com.sharma.nks.spbo.beans.requests.CreateProductRequest;
import com.sharma.nks.spbo.beans.requests.RtrvProductListRequest;
import com.sharma.nks.spbo.beans.requests.RtrvProductListResponse;
import com.sharma.nks.spbo.utils.TechnicalException;
import com.sharma.nks.spbo.utils.ValidationException;


@WebService(name="TestWS")
public interface IProductCatalogService {
	/**
	 * 
	 * @return list of Products
	 */
	@WebMethod
	//@WebResult(name="ProductList")
	public RtrvProductListResponse getAllProductList(RtrvProductListRequest req) throws TechnicalException, ValidationException;
	
	/**
	 * 
	 * @param productId
	 * @return Product with id=productId
	 */
	@WebMethod
	public Product getProductById(String productId) throws TechnicalException, ValidationException;
	
	/**
	 * 
	 * @param createProductRequest
	 * @return
	 */
	@WebMethod
	public BaseResponse addProduct(CreateProductRequest createProductRequest) throws TechnicalException, ValidationException;
	
}

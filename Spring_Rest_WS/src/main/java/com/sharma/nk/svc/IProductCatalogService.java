package com.sharma.nk.svc;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.sharma.nk.models.BaseResponse;
import com.sharma.nk.models.Product;
import com.sharma.nk.models.requests.CreateProductRequest;
import com.sharma.nk.models.requests.RtrvProductListRequest;
import com.sharma.nk.models.requests.RtrvProductListResponse;
import com.sharma.nk.utils.TechnicalException;
import com.sharma.nk.utils.ValidationException;


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

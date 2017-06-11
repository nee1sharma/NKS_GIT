package com.sharma.nk.dao;

import java.util.List;

import com.sharma.nk.models.BaseResponse;
import com.sharma.nk.models.Product;
import com.sharma.nk.models.requests.CreateProductRequest;
import com.sharma.nk.models.requests.RtrvProductListRequest;
import com.sharma.nk.models.requests.RtrvProductListResponse;
import com.sharma.nk.utils.TechnicalException;

public interface IProductCatalogDAO {
	/**
	 * 
	 * @return list of all products
	 */
	public RtrvProductListResponse getAllProductList(RtrvProductListRequest rtrvListReq)throws TechnicalException;
	
	/**
	 * 
	 * @param productId
	 * @return matching product
	 */
	public Product getProductById(String productId)throws TechnicalException;
	
	
	/**
	 * 
	 * @param createProductRequest : add new product
	 * @return responseCode 
	 */
	public BaseResponse addNewProduct(CreateProductRequest createProductRequest)throws TechnicalException;
}

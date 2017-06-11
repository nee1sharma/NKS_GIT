package com.sharma.nks.spbo.dao;

import com.sharma.nks.spbo.beans.BaseResponse;
import com.sharma.nks.spbo.beans.Product;
import com.sharma.nks.spbo.beans.requests.CreateProductRequest;
import com.sharma.nks.spbo.beans.requests.RtrvProductListRequest;
import com.sharma.nks.spbo.beans.requests.RtrvProductListResponse;
import com.sharma.nks.spbo.utils.TechnicalException;

public interface IProductCatalogDAO{
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

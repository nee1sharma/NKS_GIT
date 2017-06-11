package com.sharma.nk.models.requests;

import java.util.List;

import com.sharma.nk.models.BaseResponse;
import com.sharma.nk.models.Product;

public class ProductListResponse extends BaseResponse {

	private List<Product> productList;

	
	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
}

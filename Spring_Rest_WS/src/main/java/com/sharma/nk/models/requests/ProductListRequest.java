package com.sharma.nk.models.requests;

import java.util.List;

import com.sharma.nk.models.BaseRequest;
import com.sharma.nk.models.Product;

public class ProductListRequest extends BaseRequest{
	
	private List<Product> productList;

	
	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
}

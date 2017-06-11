package com.sharma.nks.spbo.beans.requests;

import java.util.List;

import com.sharma.nks.spbo.beans.BaseRequest;
import com.sharma.nks.spbo.beans.Product;

public class ProductListRequest extends BaseRequest{
	
	private List<Product> productList;

	
	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
}

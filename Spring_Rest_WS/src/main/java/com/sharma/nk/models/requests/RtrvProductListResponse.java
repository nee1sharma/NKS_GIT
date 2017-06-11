package com.sharma.nk.models.requests;

import java.util.List;

import com.sharma.nk.models.Product;

public class RtrvProductListResponse {
	private List<Product> productList;
	private int totalProducts;

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public int getTotalProducts() {
		return totalProducts;
	}

	public void setTotalProducts(int totalProducts) {
		this.totalProducts = totalProducts;
	}
	
	
}

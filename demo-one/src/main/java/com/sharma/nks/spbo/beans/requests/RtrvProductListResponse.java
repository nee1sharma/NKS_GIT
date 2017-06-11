package com.sharma.nks.spbo.beans.requests;

import java.util.List;

import com.sharma.nks.spbo.beans.Product;

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

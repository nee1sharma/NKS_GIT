package com.sharma.nk.models.requests;

import com.sharma.nk.models.BaseRequest;
import com.sharma.nk.models.Product;

public class CreateProductRequest extends BaseRequest {

	private Product product;

	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}

package com.sharma.nk.models.requests;

import com.sharma.nk.models.BaseResponse;
import com.sharma.nk.models.Product;

public class CreateProductResponse extends BaseResponse {

private Product product;

	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}

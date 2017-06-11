package com.sharma.nks.spbo.beans.requests;

import com.sharma.nks.spbo.beans.BaseRequest;
import com.sharma.nks.spbo.beans.Product;

public class CreateProductRequest extends BaseRequest {

	private Product product;

	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}

package com.sharma.nks.spbo.beans.requests;

import com.sharma.nks.spbo.beans.BaseResponse;
import com.sharma.nks.spbo.beans.Product;

public class CreateProductResponse extends BaseResponse {

private Product product;

	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}

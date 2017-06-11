package com.sharma.nk.transformers;

import com.sharma.nk.models.Product;
import com.sharma.nk.models.requests.CreateProductRequest;

public class ProductTransformer {

	public Product transform(CreateProductRequest req){
		return req.getProduct();
	}
}

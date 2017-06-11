package com.sharma.nk.validators;

import com.sharma.nk.models.requests.CreateProductRequest;

public class ProductValidations extends BaseRequestValidation {

	public boolean isValidInputProduct(CreateProductRequest req) {
		boolean a = isValidInputString(req.getProduct().getId());
		boolean b = isValidInputString(req.getProduct().getName());
		boolean c = isValidInputString(req.getProduct().getInfo().getBatchNumber());
		boolean d = isValidInputString(req.getProduct().getInfo().getDescription());
		boolean e = isValidInputString(req.getProduct().getInfo().getManufacturer());
		boolean f = isValidInputString(req.getProduct().getInfo().getType());
		boolean g = isValidDate(req.getProduct().getInfo().getMfgDate());
		boolean h = isValidDate(req.getProduct().getInfo().getExpiryDate());

		return a && b && c && d && e && f && g && h;
	}
	public boolean isValidProductId(String prodId){
		boolean a=isWhitespaceInputString(prodId);
		boolean b=isValidInputString(prodId);
		return a && b;
	}
}

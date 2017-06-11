package com.sharma.nk.svc;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharma.nk.dao.IProductCatalogDAO;
import com.sharma.nk.models.BaseResponse;
import com.sharma.nk.models.Product;
import com.sharma.nk.models.ProductFilterBean;
import com.sharma.nk.models.requests.CreateProductRequest;
import com.sharma.nk.models.requests.RtrvProductListRequest;
import com.sharma.nk.models.requests.RtrvProductListResponse;
import com.sharma.nk.utils.TechnicalException;
import com.sharma.nk.utils.ValidationException;

@Service
@WebService(endpointInterface="com.sharma.nk.svc.IProductCatalog")
public class ProductCatalogService implements IProductCatalogService {

	
	@Autowired
	IProductCatalogDAO catalogDAO;
	public RtrvProductListResponse getAllProductList(RtrvProductListRequest req)  throws TechnicalException, ValidationException{
	
		//ProductFilterBean productFilter=null;//new ProductFilterBean();
		//productFilter.setProductName("M");
		//req.setProductFilter(productFilter);
		return catalogDAO.getAllProductList(req);
	}

	public Product getProductById(String productId)  throws TechnicalException, ValidationException{
		return catalogDAO.getProductById(productId);
	}

	public BaseResponse addProduct(CreateProductRequest createProductRequest)  throws TechnicalException, ValidationException{
		return catalogDAO.addNewProduct(createProductRequest);
	}
	

}
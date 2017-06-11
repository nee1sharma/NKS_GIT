package com.sharma.nks.spbo.svc;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharma.nks.spbo.dao.IProductCatalogDAO;
import com.sharma.nks.spbo.beans.BaseResponse;
import com.sharma.nks.spbo.beans.Product;
import com.sharma.nks.spbo.beans.ProductFilterBean;
import com.sharma.nks.spbo.beans.requests.CreateProductRequest;
import com.sharma.nks.spbo.beans.requests.RtrvProductListRequest;
import com.sharma.nks.spbo.beans.requests.RtrvProductListResponse;
import com.sharma.nks.spbo.utils.TechnicalException;
import com.sharma.nks.spbo.utils.ValidationException;

@Service
@WebService(endpointInterface="com.sharma.nks.spbo.svc.IProductCatalog")
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
package com.sharma.nk.publisher;

import javax.xml.ws.Endpoint;

import com.sharma.nk.dao.IProductCatalogDAO;
import com.sharma.nk.svc.IProductCatalogService;
import com.sharma.nk.svc.ProductCatalogService;;



public class ProductCatalogPublisher {

	public static String WSDL_URL="http://localhost:9999/ProductCatalog";
	public static void main(String[] args) {
		

		IProductCatalogService catalog=new ProductCatalogService();
		Endpoint.publish(WSDL_URL,catalog);
		System.out.println(WSDL_URL+" ready to consume.");
		System.out.println("wsdl loc: http://localhost:9999/ProductCatalog?wsdl");
	}

}

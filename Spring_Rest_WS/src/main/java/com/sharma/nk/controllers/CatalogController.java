package com.sharma.nk.controllers;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sharma.nk.models.BaseResponse;
import com.sharma.nk.models.Product;
import com.sharma.nk.models.requests.CreateProductRequest;
import com.sharma.nk.models.requests.RtrvProductListRequest;
import com.sharma.nk.models.requests.RtrvProductListResponse;
import com.sharma.nk.svc.IProductCatalogService;
import com.sharma.nk.utils.TechnicalException;
import com.sharma.nk.utils.ValidationException;

@Controller
@RequestMapping("/rs")
public class CatalogController {

	private final static Logger logger=Logger.getLogger(CatalogController.class);;
	
	@Autowired
	public IProductCatalogService productCatalog;

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView viewListOfProducts(@RequestParam(value = "start", required = false) String s) {
		Long start = System.currentTimeMillis();

		System.out.println("here in products");
		//ProductListResponse productList = new ProductListResponse();
		RtrvProductListRequest req=new RtrvProductListRequest();
		req.setStart(s!=null?(Integer.parseInt(s)>0?Integer.parseInt(s):0):0);
		//req.setEnd(5);
		String error = null;
		try {
			RtrvProductListResponse prodListResponse=productCatalog.getAllProductList(req);
			if (null !=prodListResponse.getProductList()) {
				System.out.println("Time taken to list products : " + (System.currentTimeMillis() - start));
				return new ModelAndView("view_all_product", "product_list_response", prodListResponse);
			} else {
				error = "No products.";
				System.out.println(error);
			}
		} catch (TechnicalException e) {
			e.printStackTrace();
		} catch (ValidationException e) {
			e.printStackTrace();
		}

		return new ModelAndView("redirect:/index", "error_msg", error);

	}

	//confirm create product
	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public ModelAndView addNewProduct(Product product, BindingResult result) {
		Long start = System.currentTimeMillis();
		ModelAndView mv;
		if (result.hasErrors()) {
			mv = new ModelAndView();
			mv.addObject("error", result.getAllErrors());
			mv.setViewName("redirect:/index");
			return mv;
		}

		/*if (null == product || null == product.getInfo()) {
			product = new Product("p00001", "Monaco", 5, 0, 50, new ProductInfo("Biscuit", "Parley", "BA-120001",
					"06-12-2016", "05-06-2017", "Crispy salty and tasty", 15));
			error = "No products. Adding dummy.";
		}*/
		
		CreateProductRequest productRequest = new CreateProductRequest();
		productRequest.setProduct(product);

		BaseResponse resp = null;
		try {
			resp = productCatalog.addProduct(productRequest);
			if (null!=resp.getResponseCode().getErrorCode()) {
			return new ModelAndView("showMessage","success_message",product.getName()+" added successfully.");
			}
		} catch (TechnicalException te) {
			te.printStackTrace();
		} catch (ValidationException ve) {
			ve.printStackTrace();
		}

		System.out.println("Time taken to Add new product : " + (System.currentTimeMillis() - start));

		return new ModelAndView("showMessage","error_message","Problem in adding product "+product.getName());
	}

	@RequestMapping(value = "/product", method = RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public Product viewProductById(@RequestParam(value = "id", required = true) String productId) {
		Long start = System.currentTimeMillis();

		Product product = null;
		try {
			product = productCatalog.getProductById(productId);
		} catch (TechnicalException e) {
			e.printStackTrace();
		} catch (ValidationException e) {
			e.printStackTrace();
		}

		System.out.println("Time taken to view specific product: " + (System.currentTimeMillis() - start));

		return product;
	}

	/*************************************
	 * All Redirects goes here
	 * 
	 *************************************/

	//propose create product
	@RequestMapping(value = "/verifyProduct", method = RequestMethod.POST)
	public ModelAndView verifyNewProduct(Product product, BindingResult result) {
		
		ModelAndView mv=new ModelAndView();
		
		if (result.hasErrors()) {
			mv.addObject("error", result.getAllErrors());
			mv.setViewName("redirect:/index");
			return mv;
		}
		
		mv.setViewName("verify_product");
		mv.addObject("product",product);
		return mv;
	}
	
	@RequestMapping(value = "/add_product")
	public String redirectToAddProduct() {
		//String method="";
		String url="/add_product";
		
		
		logger.debug("Inside CatalogController redirectToAddProduct() redirecting to add_product");
		return url;
	}

	
	@RequestMapping(value="/homepage")
	public String redirectToHomePage(){
		String url="/homepage";
		return url;
	}
}

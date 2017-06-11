package com.sharma.nks.spbo.beans.requests;

import com.sharma.nks.spbo.beans.BaseRequest;
import com.sharma.nks.spbo.beans.ProductFilterBean;

public class RtrvProductListRequest extends BaseRequest {

	private ProductFilterBean productFilter;
	private int start;
	private int end;
	
	
	

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public ProductFilterBean getProductFilter() {
		return productFilter;
	}

	public void setProductFilter(ProductFilterBean productFilter) {
		this.productFilter = productFilter;
	}
	
}

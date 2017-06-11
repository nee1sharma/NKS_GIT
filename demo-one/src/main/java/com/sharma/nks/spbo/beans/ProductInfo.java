package com.sharma.nks.spbo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="ProductInfo")
@XmlType(propOrder={"type","description","netContents","manufacturer","mfgDate","expiryDate","batchNumber"})
@Entity
@Table(name="TABLE_PRODUCT_INFO")
public class ProductInfo {
	@Id
	@Column(name="batch_number",length=12)
	private String batchNumber;
	
	@Column(name="manufacturer",length=50)
	private String manufacturer;

	@Column(name="mfg_date",length=10)
	private String mfgDate;
	
	@Column(name="expiry_date",length=10)
	private String expiryDate;

	@Column(name="type",length=20)
	private String type;
	
	@Column(name="description")
	private String description;
	private int netContents;
	
	public ProductInfo() {	}
	public ProductInfo(String type, String manufacturer,
			String batchNumber, String mfgDate, String expiryDate, String description, int netContents) {
		this.type = type;
		this.manufacturer = manufacturer;
		this.batchNumber = batchNumber;
		this.mfgDate = mfgDate;
		this.expiryDate = expiryDate;
		this.description = description;
		this.netContents = netContents;
	}
	
	public String getBatchNumber() {
		return batchNumber;
	}
	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getMfgDate() {
		return mfgDate;
	}
	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getNetContents() {
		return netContents;
	}
	public void setNetContents(int netContents) {
		this.netContents = netContents;
	}
	@Override
	public String toString() {
		return "ProductInfo [batchNumber=" + batchNumber + ", manufacturer=" + manufacturer + ", mfgDate=" + mfgDate
				+ ", expiryDate=" + expiryDate + ", type=" + type + ", description=" + description + ", netContents=" + netContents + "]";
	}

}

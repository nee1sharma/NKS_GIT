package com.sharma.nks.spbo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name="Product")
@XmlType(propOrder={"id","name","quantity","price","discount","info"})
@Entity
@Table(name="TABLE_PRODUCT")
public class Product {
	
	@Id
	@Column(length=12)
	private String id;
	@Column(length=50)
	private String name;
	private int price;
	@OneToOne
	private ProductInfo info;
	@Column(length=2)
	private int discount;
	@Column(length=5)
	private int quantity;
	public Product(){}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public ProductInfo getInfo() {
		return info;
	}

	public void setInfo(ProductInfo info) {
		this.info = info;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Product(String id, String name, int price, int discount, int quantity, ProductInfo info) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.quantity = quantity;
		this.info = info;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", discount=" + discount + ", quantity="
				+ quantity + ", info=" + info + "]";
	}
	
}

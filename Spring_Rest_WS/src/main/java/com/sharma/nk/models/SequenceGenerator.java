package com.sharma.nk.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="table_sequence")
public class SequenceGenerator {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="user_id_sequence")
	private int userIdSeq;
	@Column(name="product_id_sequence")
	
	private int productIdSeq;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserIdSeq() {
		return userIdSeq;
	}
	public void setUserIdSeq(int userIdSeq) {
		this.userIdSeq = userIdSeq;
	}
	public int getProductIdSeq() {
		return productIdSeq;
	}
	public void setProductIdSeq(int productIdSeq) {
		this.productIdSeq = productIdSeq;
	}
}

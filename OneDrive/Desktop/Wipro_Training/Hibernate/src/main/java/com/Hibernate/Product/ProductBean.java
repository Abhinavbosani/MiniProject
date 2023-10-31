package com.Hibernate.Product;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class ProductBean {
	private String productName;
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int productId;
	private int price;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public ProductBean(String productName, int productId, int price) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.price = price;
	}
	public ProductBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productId=" + productId + ", price=" + price + "]";
	}
	
	

}

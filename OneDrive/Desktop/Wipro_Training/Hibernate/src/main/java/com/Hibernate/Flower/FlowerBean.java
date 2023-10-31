package com.Hibernate.Flower;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FlowerBean {
	@Id
	private String flowerId;
	private String flowerName;
	private String color;
	
	private int price;
	public String getFlowerId() {
		return flowerId;
	}
	public void setFlowerId(String flowerId) {
		this.flowerId = flowerId;
	}
	public String getFlowerName() {
		return flowerName;
	}
	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}
	public String getColorString() {
		return color;
	}
	public void setColorString(String colorString) {
		this.color = colorString;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public FlowerBean(String flowerId, String flowerName, String colorString, int price) {
		super();
		this.flowerId = flowerId;
		this.flowerName = flowerName;
		this.color = colorString;
		this.price = price;
	}
	public FlowerBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FlowerBean [flowerId=" + flowerId + ", flowerName=" + flowerName + ", color=" + color
				+ ", price=" + price + "]";
	}
	
	

}

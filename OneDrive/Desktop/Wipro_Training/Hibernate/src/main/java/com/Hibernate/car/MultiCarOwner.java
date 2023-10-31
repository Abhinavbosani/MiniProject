package com.Hibernate.car;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
@Entity
public class MultiCarOwner {
	@Id
	@Column(length=10)
	private int ownerId;
	@Column(length=15)
	private String ownername;
	
	public MultiCarOwner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public  MultiCarOwner(int ownerId, String ownername) {
		super();
		this.ownerId = ownerId;
		this.ownername = ownername;
		
	}
	@OneToMany
	private List<CarDetails> car = new ArrayList<CarDetails>();
	
	
	
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
//	public CarDetails getCar() {
//		return car;
//	}
//	public void setCar(CarDetails car) {
//		this.car = car;
//	}
//	
	public List<CarDetails> getCar() {
		return car;
	}
	public void setCar(List<CarDetails> car) {
		this.car = car;
	}
	
	

}

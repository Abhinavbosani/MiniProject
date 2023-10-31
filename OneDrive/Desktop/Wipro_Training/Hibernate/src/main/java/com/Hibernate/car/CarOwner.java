package com.Hibernate.car;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class CarOwner {
	@Id
	private int ownerId;
	private String ownername;
	 CarOwner(int ownerId, String ownername) {
		super();
		this.ownerId = ownerId;
		this.ownername = ownername;
		
	}
	@OneToOne
	private CarDetails car;
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
	public CarDetails getCar() {
		return car;
	}
	public void setCar(CarDetails car) {
		this.car = car;
	}
	
	
	

}

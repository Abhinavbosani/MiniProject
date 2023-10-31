package com.Hibernate.car;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cars")
public class CarDetails {
	
	@Column(length=5)
	private String RegNo;
	@Id
	@Column(length=20)
	private String Model;
	@Column(length=10)
	private String Color;
	@Column(length=20)
	private String Manufacturer;
	
//	@OneToOne
//	@JoinColumn(name="p_id")
//	private CarOwner owner;
	
	@ManyToOne
	@JoinColumn(name = "ownerId") 
	private MultiCarOwner mco;
	
	public MultiCarOwner getMco() {
		return mco;
	}




	public void setMco(MultiCarOwner mco) {
		this.mco = mco;
	}




//	public CarOwner getOwner() {
//		return owner;
//	}




//	public void setOwner(CarOwner owner) {
//		this.owner = owner;
//	}




	public String getRegNo() {
		return RegNo;
	}




	public void setRegNo(String regNo) {
		RegNo = regNo;
	}




	public String getModel() {
		return Model;
	}




	public void setModel(String model) {
		Model = model;
	}




	public String getColor() {
		return Color;
	}




	public void setColor(String color) {
		Color = color;
	}




	public String getManufacturer() {
		return Manufacturer;
	}




	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}




	@Override
	public String toString() {
		return "CarDetails [RegNo=" + RegNo + ", Model=" + Model + ", Color=" + Color + ", Manufacturer=" + Manufacturer
				+ "]";
	}

	
	
}

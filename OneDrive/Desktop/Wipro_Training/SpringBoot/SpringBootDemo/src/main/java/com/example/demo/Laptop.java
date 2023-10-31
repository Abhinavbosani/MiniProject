package com.example.demo;

import java.util.jar.Attributes.Name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {
	private int id;
	private String brand;
	@Autowired
	private Battery battery;
	@Autowired
	private Harddisk harddisk;
	
	public Battery getBattery() {
		return battery;
	}
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	public Harddisk getHarddisk() {
		return harddisk;
	}
	public void setHarddisk(Harddisk harddisk) {
		this.harddisk = harddisk;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brand=" + brand + ", battery=" + battery + ", harddisk=" + harddisk + "]";
	}
	
	
//	public void compile() {
//		System.out.println("Compiling...");
//	}
	
	
}

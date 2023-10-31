package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Battery {
	private int capacity;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Battery [capacity=" + capacity + "]";
	}
	
	
	

}

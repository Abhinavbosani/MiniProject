package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Harddisk {
	private int hid;
	private String storage;
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	@Override
	public String toString() {
		return "Harddisk [hid=" + hid + ", storage=" + storage + "]";
	}
	
	

}

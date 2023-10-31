package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DemoApplication.class, args);
//		Alien a=context.getBean(Alien.class);
		Laptop l=context.getBean(Laptop.class);
		Battery b=context.getBean(Battery.class);
		Harddisk h=context.getBean(Harddisk.class);
		b.setCapacity(5000);
		h.setHid(1);
		h.setStorage("2TB");
		l.setId(2);
		l.setBrand("Dell");
		l.setBattery(b);
		l.setHarddisk(h);
		System.out.println(l);
		
		
	
	}

}

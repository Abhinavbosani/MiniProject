package com.Hibernate.Employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.id.IncrementGenerator;

@Entity
public class EmployeeBean {
	private String name;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String desg;
	private int salary;
	@OneToOne
	private Address add;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public EmployeeBean(int id, String name, String desg, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.desg = desg;
		this.salary = salary;
	}
	public EmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeBean [name=" + name + ", id=" + id + ", desg=" + desg + ", salary=" + salary + "]";
	}
	public void setAdd(Address a1) {
		this.add=a1;
		
		// TODO Auto-generated method stub
		
	}
	public Address getAdd() {
		return add;
	}
	
	
	
	
	
}

package com.mvchibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.mvchibernate.bean.Employee;

@Component
public class EmployeeDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createEmployee(Employee emp)
	{
		this.hibernateTemplate.save(emp);
	}
	
	public Employee getEmployeebyId(int eid)
	{
		Employee emp=this.hibernateTemplate.get(Employee.class, eid);
		return emp;
	}
	public List<Employee> getAllEmployee()
	{
		List<Employee> emps=this.hibernateTemplate.loadAll(Employee.class);
		return emps;
	}
	
	@Transactional
	public void deleteEmployee(int eid)
	{
		Employee emp=this.hibernateTemplate.get(Employee.class, eid);
		this.hibernateTemplate.delete(emp);
		
	}
	@Transactional
	public void updateEmployee(Employee emp)
	{
		this.hibernateTemplate.update(emp);
	}
}
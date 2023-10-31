package com.bootjpa.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootjpa.demo.model.Employee;
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

}

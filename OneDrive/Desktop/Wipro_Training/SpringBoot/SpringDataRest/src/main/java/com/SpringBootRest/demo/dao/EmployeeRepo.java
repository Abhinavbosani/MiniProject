package com.SpringBootRest.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SpringBootRest.demo.model.Employee;



public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

}

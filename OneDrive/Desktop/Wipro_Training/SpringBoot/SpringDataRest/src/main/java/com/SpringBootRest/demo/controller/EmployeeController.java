package com.SpringBootRest.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.SpringBootRest.demo.dao.EmployeeRepo;
import com.SpringBootRest.demo.model.Employee;





@Controller
public class EmployeeController {
	@Autowired
	EmployeeRepo repo;
	
	@RequestMapping("/index")
	public String home() {
		
		return "index";
	}
	@PostMapping("/employee")
	public Employee addAlien(@RequestBody Employee emp) {
		repo.save(emp);
		return emp;
	}
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
	
		return (List<Employee>) repo.findAll();
		
	}
	@RequestMapping("/employee/{eid}")
	
	public Optional<Employee> getEmployee(@PathVariable("eid") int eid){
		return repo.findById(eid);
	}
	
	@DeleteMapping("/employee/{eid}")
	public String deleteAlien(@PathVariable int eid) {
		Employee e=repo.getReferenceById(eid);
		repo.delete(e);
		return "deleted";
	}
	@PutMapping(path = "/employee",consumes = {"apllication/json"})
	public Employee updateAlien(@RequestBody Employee emp) {
		repo.save(emp);
		return emp;
	}


}

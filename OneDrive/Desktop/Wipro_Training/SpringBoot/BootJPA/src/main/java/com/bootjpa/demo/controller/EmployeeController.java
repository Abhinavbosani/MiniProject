package com.bootjpa.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bootjpa.demo.dao.EmployeeRepo;
import com.bootjpa.demo.model.Employee;
@Controller
public class EmployeeController {
	@Autowired
	EmployeeRepo repo;
	
	@RequestMapping("/index")
	public String home() {
		
		return "index";
	}
	@RequestMapping("/addEmployee")
	public String addEmployee(Employee emp) {
		repo.save(emp);
		return "index";
		
	}
	@RequestMapping("/getEmployee")
	public ModelAndView getEmployee(@RequestParam("eid") String eid) {
		int e=Integer.parseInt(eid);
		ModelAndView mv=new ModelAndView("showEmployee");
		Employee emp=repo.findById(e).orElse(new Employee());
		mv.addObject("emp",emp);
		return mv;
		
	}
	@RequestMapping("/deleteEmployee")
	public ModelAndView deleteEmployee(String eid) {
		int e=Integer.parseInt(eid);
		ModelAndView mv=new ModelAndView("deleteEmployee");
		
		Employee emp=repo.findById(e).orElse(new Employee());
		repo.delete(emp);
		
		
		mv.addObject("eid", e);
		return mv;
		
	}
	@RequestMapping("/updateEmployee")
	public ModelAndView updateEmployee(Employee emp) {
		
		ModelAndView mv=new ModelAndView("updateEmployee");
		mv.addObject("eid", emp.getEid());
		repo.delete(emp);
		repo.save(emp);
		
		
		return mv;
		
	}


}

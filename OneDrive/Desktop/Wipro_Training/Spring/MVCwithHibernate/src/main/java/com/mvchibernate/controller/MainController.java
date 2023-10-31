package com.mvchibernate.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.mvchibernate.bean.Employee;
import com.mvchibernate.dao.EmployeeDao;

@Controller
public class MainController {
	
	@Autowired
	private EmployeeDao empDao;
	
	@RequestMapping("/")
	public String home(Model m)
	{
		List<Employee> emps=empDao.getAllEmployee();
		m.addAttribute("emps",emps);
		return "index";
	}
	
	@RequestMapping("/add-emp")
	public String add_employee(Model model)
	{
		model.addAttribute("title","Add Employee");
		return "addform";
	}
	
	
	@RequestMapping(value="/AddHandle", method=RequestMethod.POST)
	public RedirectView addhandle(@ModelAttribute Employee emp, HttpServletRequest request)
	{
		//System.out.println(emp);
		empDao.createEmployee(emp);
		RedirectView rv=new RedirectView();
		rv.setUrl(request.getContextPath() +"/index2.jsp");
		return rv;
	}
	
	@RequestMapping(value="/delete/{empid}")
	public RedirectView deleteemployee(@PathVariable("empid") int empid,HttpServletRequest request)
	{	this.empDao.deleteEmployee(empid);
		RedirectView rv=new RedirectView();
		rv.setUrl(request.getContextPath() +"/");
		return rv;
	}

}

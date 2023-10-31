package com.mvchibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvchibernate.bean.Department;
import com.mvchibernate.dao.DepartmentDao;

@Controller
public class DepartmentController {
	@Autowired
	DepartmentDao dao;
	
	@RequestMapping("/PreInsertDepartment")
	public ModelAndView preInsert() {
		Department d=new Department();
		d.setDeptno(dao.getDepartmentId());
		ModelAndView mv=new ModelAndView("InsertDepartment","department",d);
		return mv;
		
	}
	@RequestMapping("/InsertDepartment")
	public ModelAndView insertDepartment(@ModelAttribute("department") Department dept) {
		ModelAndView mv=new ModelAndView("result","department",dept);
		if(dao.insertDepatment(dept))
			mv.addObject("msg", "Inserted Successfully");
		else
			mv.addObject("msg", "Insert Failed");
		
		return mv;
		
	}

}

package com.mvchibernate.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvchibernate.bean.Student;
import com.mvchibernate.dao.StudentDao2;

@Controller
public class StudentController2 {

	@Autowired
	StudentDao2 dao;

	@RequestMapping("/PreViewStudent")
	public ModelAndView preView() {
		Student student = new Student();
		student.setStudentid(dao.getStudentId());
		return new ModelAndView("ViewStudent", "student", student);
	}

	@RequestMapping("/ViewStudent")
	public ModelAndView ViewStudent(@ModelAttribute("student") Student stu) {
		ModelAndView mv = new ModelAndView("result3", "student", stu);
		if (dao.viewStudent(stu))
			mv.addObject("msg", "Viewed Successfully");
		else
			mv.addObject("msg", "Viewed Failed");
		return mv;
	}
}
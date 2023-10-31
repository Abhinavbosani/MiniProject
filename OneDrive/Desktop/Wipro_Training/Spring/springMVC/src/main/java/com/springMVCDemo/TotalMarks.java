package com.springMVCDemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TotalMarks {
	
	@RequestMapping("/Total")
	public ModelAndView add(HttpServletRequest req) {
		int a=Integer.parseInt(req.getParameter("science"));
		int b=Integer.parseInt(req.getParameter("maths"));
		int c=Integer.parseInt(req.getParameter("english"));
		int d=(a+b+c);
		ModelAndView mv=new ModelAndView("displaysum","sum",d);
		return mv;
		
		
		

		
	}

}

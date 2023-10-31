package com.springMVCDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/Hello")
	public String display() {
		return "HelloPage";
	}
	@RequestMapping("/HelloWorld")
	public ModelAndView sayHello() {
		String msg="Hello World";
		ModelAndView mv= new ModelAndView("HelloPage","myMessage",msg);
		return mv;
		
	}

}

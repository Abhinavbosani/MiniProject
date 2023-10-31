package com.springMVCDemo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MoviesController {
	@RequestMapping("/Movies")
	public ModelAndView displayMovies(){
		ArrayList<String> al=new ArrayList<String>();
		al.add("RRR");
		al.add("Bahubali");
		al.add("Pokiri");
		al.add("Interstellar");
		al.add("The Dark Knight");
		al.add("Athadu");
		al.add("Vikram");
		al.add("Srimanthudu");
		al.add("Titanic");
		al.add("Avatar");
		ModelAndView mv=new ModelAndView("Result","list",al);
		return mv;
	}
	@RequestMapping("/MoviesList")
	public ModelAndView displayMoviesInList(){
		ArrayList<String> al=new ArrayList<String>();
		al.add("RRR");
		al.add("Bahubali");
		al.add("Pokiri");
		al.add("Interstellar");
		al.add("The Dark Knight");
		al.add("Athadu");
		al.add("Vikram");
		al.add("Srimanthudu");
		al.add("Titanic");
		al.add("Avatar");
		ModelAndView mv=new ModelAndView("Result","list",al);
		return mv;
	}

}

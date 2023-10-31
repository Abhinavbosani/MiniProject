package com.bootjpa.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootjpa.demo.dao.AlienRepo;
import com.bootjpa.demo.model.Alien;

@RestController
public class AlienController {
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/home")
	public String home() {
		
		return "home";
	}
//	@RequestMapping("/addAlien")
//	public String addAlien(Alien alien) {
//		repo.save(alien);
//		return "home";
//		
//	}
//	@RequestMapping("/getAlien")
//	public ModelAndView getAlien(String aid) {
//		int a=Integer.parseInt(aid);
//		ModelAndView mv=new ModelAndView("showAlien");
//		Alien alien=repo.findById(a).orElse(new Alien());
//		
//		
//		mv.addObject(alien);
//		return mv;
//		
//	}
	
	
//	Using Rest API
	@PostMapping("/alien")
	public Alien addAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}
	@DeleteMapping("/alien/{aid}")
	public String deleteAlien(@PathVariable int aid) {
		Alien a=repo.getReferenceById(aid);
		repo.delete(a);
		return "deleted";
	}
	
	@PutMapping(path = "/alien",consumes = {"apllication/json"})
	public Alien updateAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}
	
	
	
	@GetMapping("/aliens")
	public List<Alien> getAliens() {
	
		return repo.findAll();
		
	}
	@RequestMapping("/alien/{aid}")
	
	public Optional<Alien> getAlien(@PathVariable("aid") int aid){
		return repo.findById(aid);
	}
	
	

}

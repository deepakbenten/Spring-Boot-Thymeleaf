package com.practice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class MyController {
	
	
	@RequestMapping(value="/about", method = RequestMethod.GET )
	public String about(Model model) {
		System.out.println("this is about inside...!");
		
		model.addAttribute("name", "Deepak kumar");
		model.addAttribute("CurrentDate", new Date().toLocaleString());
		return "about";
	}
	
	
	//handle iterate
	@GetMapping("/example-loop")
	public String iteratHandle(Model m) {
		//create a list , set collection
		List<String> names=List.of("Deepak", "Lokesh", "Praveen", "Ram");
		m.addAttribute("names", names);
		return "iterate";
	}
	
	
	//handle conditional
	@GetMapping("/conditional")
	public String conditionalHandle(Model m) {
		System.out.println("conditional handler..!!");
		m.addAttribute("isActive", false);
		m.addAttribute("gender","M");
		m.addAttribute("gender","F");
		List<Integer> list = List.of(10,20,30,40,50,60);
		m.addAttribute("mylist", list);
		return "conditional";
	}
	
	//handler for including fragments
	@GetMapping("/service")
	public String servicehandler(Model m) {
		
		
		return "service";
	}
	
	
	//for new about
	@GetMapping("/newabout")
	public String newAbout() {
		
		return "aboutnew";
	}
	
	//for new contact 
	@GetMapping("/contact")
	public String newContact() {
		return "contact";
	}
	
	
	

}

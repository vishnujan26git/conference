package com.learning.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

/*	@GetMapping("greeting")
	public String greeting(Map<String, Object> model) {
		System.out.println("Into controller");
		model.put("message", "Hello Vishnu!");
		return "greeting";
	}*/
	
	@GetMapping("greeting")
	public String greeting(Model model) {
		System.out.println("Into the greeting controller");
		model.addAttribute("message", "Hello World!");
		return "greeting";
	}
}

package com.netcracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {

	@RequestMapping(value="/greet")
	public String sendGreeting(Model model){
		
		 model.addAttribute("gm","Hello How are you");
		
		  return "Welcome";
		  
		 /*
		 ModelAndView mv=new ModelAndView();
		 mv.setViewName("Welcome");
		 mv.addObject("gm", "Hello How are you?");
		 
		 
		
		  return mv;
		*/
		
	}
	
	
	
	
	
}

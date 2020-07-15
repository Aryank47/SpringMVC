package com.netcracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.netcracker.dto.User;

@Controller
public class UserAutherntication {

	 @RequestMapping(value="/home")
	 public String takeMeToLogin(Model model){
		 
		   User user=new User();
		 
		  model.addAttribute("container",user);
		 
		 return "Login";
		 
	 }
	 
	 @RequestMapping(value="/ValidateUser",method=RequestMethod.POST)
	 public String checkUser(@ModelAttribute("container") User user,Model model){
		 
		 
		 if(user.getUsername().equals("abc") && user.getPassword().equals("abc123")){
			 
			 model.addAttribute("myuser", user.getUsername());
			 
			 return "Success";
		 }
		 else{
			 
			  return "Failure";
			 
		 }
			 
		 
		 
		 
		 
	 }
	 





}

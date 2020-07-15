package com.netcracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.netcracker.dto.Employee;
import com.netcracker.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="/emphome")
	 public String gotoEmpHome(){
		 
		    return "EmployeeHome";
		
		 
	 }
	
	
	@RequestMapping(value="/GetByID")
	public String getDataById(@RequestParam("eid") int empId,Model model){
		
		Employee employee=employeeService.getEmployeeById(empId);
		
		model.addAttribute("empdata",employee);
		
		return "ShowEmployee";
		
		
	}





}

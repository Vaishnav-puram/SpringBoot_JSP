package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.service.EmployeeService;

@Controller
@RequestMapping("/dept/emps")
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	public EmployeeController() {
		System.out.println("inside cstr of Employee controller");
	}
	
	@GetMapping("/empList")
	public String getEmps(@RequestParam Long id,Model model) {
		System.out.print("inside postmapping --> /empList");
		System.out.println(id);
		model.addAttribute("emp_list", empService.getAllEmployees(id));
		return "/emp/list";
	}
	
}

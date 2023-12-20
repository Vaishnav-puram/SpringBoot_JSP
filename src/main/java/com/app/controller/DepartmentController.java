package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.service.DepartmentService;

@Controller
@RequestMapping("/dept")
public class DepartmentController {
	// depcy
	@Autowired // (required = true)
	private DepartmentService deptService;

	public DepartmentController() {
		System.out.println("in def ctor of " + getClass());
	}

	// URL : http://host:port/ctx_path/dept/list
	// method : GET
	@GetMapping("/list")
	public String listAllDepts(Model map) {
		System.out.println("in list all depts");
		// invoke service layer method
		map.addAttribute("dept_list", deptService.getAllDepartments());
		return "/dept/list";// AVN : /WEB-INF/views/dept/list.jsp
/*
 * dept Handler : expl -- LVN
 * impl : model map 
 */
	}

}

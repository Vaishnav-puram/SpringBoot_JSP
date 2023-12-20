//package com.app.controller;
//
//import java.time.LocalDateTime;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class IndexController {
//	public IndexController() {
//		System.out.println("in ctor of "+getClass());
//	}
//	@GetMapping("/")
//	public String showIndexPage(Model map) {
//		System.out.println("in show index page");
//		map.addAttribute("server_ts", LocalDateTime.now());
//		return "/index";//AVN : /WEB-INF/views/index.jsp
//	}
//
//}

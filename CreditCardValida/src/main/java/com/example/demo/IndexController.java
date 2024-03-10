package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/home")
	public String index() {
		System.out.println("Home Page");
		return "index.jsp";
	}
	
}
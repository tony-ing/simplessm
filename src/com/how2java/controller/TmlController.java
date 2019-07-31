package com.how2java.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class TmlController {
	
	@RequestMapping("/hello")
	public String hello(Model m) {
		m.addAttribute("name", "thymeleaf");
		return "hello";
	}
	
	

}

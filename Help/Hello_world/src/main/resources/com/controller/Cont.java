package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Cont {
	
	
	@RequestMapping("/home")
	public String a() {
		return "home";
	}

}

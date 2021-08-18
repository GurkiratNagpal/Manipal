package com.mvc.contr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home_Controller {
	
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Home url shown");
		return "index";
	}
	
	

}

package com.tms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	@GetMapping("/ord")
	public String DisplayOrder() {
		return "Here are all your orders";
	}

}

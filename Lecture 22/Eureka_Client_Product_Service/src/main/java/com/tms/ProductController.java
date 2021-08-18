package com.tms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@GetMapping("/prods")
	public String displayProducts() {
		return "Here are all your products!";
	}

}

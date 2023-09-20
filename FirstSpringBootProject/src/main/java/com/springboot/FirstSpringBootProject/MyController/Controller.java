package com.springboot.FirstSpringBootProject.MyController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/")
	public String sayHello() {
		return "Welcome to spring boot 1st program.";
		
	}

}

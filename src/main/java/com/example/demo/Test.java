package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	@GetMapping("/hello")
	public String sayHello(){
		System.out.println("rest works");
		return "{\"message\":\"hey\"}";
	}
}

package com.example.rests.demorests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemorestsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemorestsApplication.class, args);
	}
	
	@GetMapping("/rest1")
	public String rest1() {
		return "Rest1 is working inside docker";
	}
	
	@GetMapping("/rest2")
	public String rest2() {
		return "Rest2 is working inside docker";
	}

	@GetMapping("/rest3")
	public String rest3() {
		return "Rest3 is working inside docker";
	}

}

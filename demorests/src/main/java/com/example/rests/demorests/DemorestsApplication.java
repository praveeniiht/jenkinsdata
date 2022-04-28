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
	
	@GetMapping("/rest")
	public String rest() {
		return "Rest is working inside docker";
	}

}

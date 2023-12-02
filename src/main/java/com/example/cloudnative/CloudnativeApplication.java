package com.example.cloudnative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class CloudnativeApplication {

	@RequestMapping("/")
	String home() {
		return "Hello World!fadfdsa!!!!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CloudnativeApplication.class, args);
	}

}
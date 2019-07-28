package com.example.robo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RoboApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoboApplication.class, args);
	}
	
	@GetMapping("/")
    public String hello() {
            return "Hello Spring Boot!";
    }
	
	@GetMapping("/hello")
	public String helloworld() {
		return "hello world";
	}
	
	@GetMapping("/robo")
	public String direction(@RequestParam String direction) {
		return direction;
	}
}

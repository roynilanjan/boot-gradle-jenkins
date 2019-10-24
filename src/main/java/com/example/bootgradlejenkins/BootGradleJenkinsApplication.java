package com.example.bootgradlejenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootGradleJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootGradleJenkinsApplication.class, args);
	}
	@GetMapping("/")
	public String sayHello(){
		return "Hi from Cloudbees Jenkins";
	}

}

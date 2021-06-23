package com.example.springcodepipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCodepipelineApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World with Hasitha";
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringCodepipelineApplication.class, args);
	}

}

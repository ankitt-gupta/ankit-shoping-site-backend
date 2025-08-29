package com.ankit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Remove @AutoConfiguration and @EnableAutoConfiguration
@SpringBootApplication // <--- This is all you need!
public class MavenSpringbootTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenSpringbootTemplateApplication.class, args);
	}

}
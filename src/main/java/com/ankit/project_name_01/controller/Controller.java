package com.ankit.project_name_01.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/ankit")
	ResponseEntity<String> getName() {

		return ResponseEntity.ok("Ankit");
	}

}
package com.reed.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController
{

	@GetMapping("/welcome")
	public ResponseEntity<Object> hello()
	{
		return ResponseEntity.status(HttpStatus.OK).body("Hello to All.....");
	}
	
}

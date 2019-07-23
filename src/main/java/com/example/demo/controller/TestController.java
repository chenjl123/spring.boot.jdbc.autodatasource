package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TestService;

@RestController
public class TestController {
	
	@Autowired
	private TestService test;
	
	@GetMapping("test")
	public void test(){
		test.query("1");
		test.query("2");
		test.query("3");
	}
}

package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	
	@RequestMapping("/hello")
	public String sayGreeting() {
		return "hello team";
	}
	
	public List<String> getGreeting(){
		return Arrays.asList("gm","ga","gn");
	}
}

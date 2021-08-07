package com.demo.excel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class HomeController {

	
	@GetMapping("api")
	public String getHomeValue() {
		return "Jai Shree Ram";
	}
}

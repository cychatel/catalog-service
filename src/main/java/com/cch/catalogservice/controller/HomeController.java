package com.cch.catalogservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cch.catalogservice.config.CatalogProperties;

@RestController
public class HomeController {

	private final CatalogProperties catalogProperties;
	
	public HomeController(CatalogProperties catalogProperties) {
		this.catalogProperties = catalogProperties;
	}
	
	@GetMapping("/")
	public String getGreeting() {
		return catalogProperties.getGreeting();
	}
}

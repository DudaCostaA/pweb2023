package br.edu.ifgoiano.apimoodle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class HelloController {
	
	@GetMapping
	public String digaOla() {
		return "Olá Mundo!";
	}

}
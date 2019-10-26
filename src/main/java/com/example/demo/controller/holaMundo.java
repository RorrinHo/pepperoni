package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/controller")
@RestController
public class holaMundo {
		
	@GetMapping(value = "/metodo")	
	public String consultarFechas(){
		
		return "Hola Pepperoni"; 
			
	}
	
}
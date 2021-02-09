package com.example.sonarwithjunit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


	@RequestMapping(value="/welcome" ,method=RequestMethod.GET)
	public String Welcome()
	{
<<<<<<< HEAD
		return "Welcome to Testing using JUNIT ";
=======
		
		return "Welcome to Testing using JUNIT";
>>>>>>> origin/master
	}
}

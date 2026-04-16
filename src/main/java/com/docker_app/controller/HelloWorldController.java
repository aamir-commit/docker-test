package com.docker_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	
	// building one handler method
	
	
	@GetMapping("/message")
	public String getMessage() {
		
		return "hello-world";
		
		
	}






}


// this is a simple hellow world class for the docker image push



// go to the root folder of the project and create one "Dockerfile"

// go to the pom.xml file of the project and give the tag called
// <finalName>docker-app</finalName>

//  we have given this name because this is the name through which the jar file creation is happen
// so that is why we have provided this name 



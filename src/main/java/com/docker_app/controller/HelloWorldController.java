package com.docker_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	
	// building one handler method
	
	
	@GetMapping("/message")
	public String getMessage() {
		
		return "hello-world, i have to change myself, things are not running as i have been planned and have to change the things and work accordingly";
		
		
	}






}


// this is a simple hello world class for the docker image push



// go to the root folder of the project and create one "Dockerfile"

// go to the pom.xml file of the project and give the tag called
// <finalName>docker-app</finalName>

//  we have given this name because this is the name through which the jar file creation is happen
// so that is why we have provided this name 

// we have added the following code in the Dockerfile


//FROM openjdk:17

//COPY target/docker-app.jar  /usr/app/n --> this is the file path in your docker container & this "target/docker-app.jar" is the jar file name

//WORKDIR /usr/app/

//EXPOSE 8080   --> this is optional , and this is the port number on which my application is running

//ENTRYPOINT ["java","-jar","docker-app.jar"]

// the jar file is present in the target folder








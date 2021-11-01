package com.qa.puppies.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Create - Post (sending something to be stored in the DB)
//Read - Get (fetch data)
//Update - Put (replacing data)/Patch (updating data)
//Delete - Delete (removing data)

@RestController //enables request handling
public class PuppyController {
	
	@GetMapping("/hello") //listen for a request at /hello
	public String hello() {
		return "Hello, World!"; //sends response
	}
	
}

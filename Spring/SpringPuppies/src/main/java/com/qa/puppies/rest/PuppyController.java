package com.qa.puppies.rest;

import org.springframework.web.bind.annotation.*;

@RestController //enables request handling
public class PuppyController {
	
	@GetMapping("/hello") //listen for a request at /hello
	public String hello() {
		return "Hello, World!"; //sends response
	}
}

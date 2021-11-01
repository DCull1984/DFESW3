package com.qa.puppies.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.puppies.domain.Puppy;

//Create - Post (sending something to be stored in the DB)
//Read - Get (fetch data)
//Update - Put (replacing data)/Patch (updating data)
//Delete - Delete (removing data)

@RestController //enables request handling
public class PuppyController {
	
	//PURELY FOR DEMO PURPOSES
	private ArrayList<Puppy> puppies = new ArrayList<>(); //Placeholder for a DataBase
	
	@GetMapping("/hello") //listen for a request at /hello
	public String hello() {
		return "Hello, World!"; //sends response
	}
	
	@PostMapping("/create") //triggered by a POST request to /create
	public Puppy createPuppy(@RequestBody Puppy newPuppy) { //a puppy object in the request + response
		this.puppies.add(newPuppy);
		return this.puppies.get(this.puppies.size() - 1);
	}

	@GetMapping("/getAll") //get all information from the list/DB
	public List<Puppy> getAllPuppies() {
		return this.puppies;
	}
	
	@GetMapping("/get/{id}") // getPuppy with id of {id}
	public Puppy getPuppy(@PathVariable Integer id) {
		return this.puppies.get(id);
	}
}

package com.qa.puppies.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.puppies.domain.Puppy;
import com.qa.puppies.service.PuppyServiceList;

//Create - Post (sending something to be stored in the DB)
//Read - Get (fetch data)
//Update - Put (replacing data)/Patch (updating data)
//Delete - Delete (removing data)

@RestController //enables request handling
public class PuppyController {

	//PURELY FOR DEMO PURPOSES
	//private ArrayList<Puppy> puppies = new ArrayList<>(); //Placeholder for a DataBase
	
	@Autowired	//instructs spring to inject dependency
	private PuppyServiceList service; //dependency

	public PuppyController(PuppyServiceList service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/hello") //listen for a request at /hello
	public String hello() {
		return "Hello, World!"; //sends response
	}

	@PostMapping("/create") //triggered by a POST request to /create
	public ResponseEntity<Puppy> createPuppy(@RequestBody Puppy newPuppy) { //a puppy object in the request + response
		Puppy responseBody = this.service.createPuppy(newPuppy);
		return new ResponseEntity<>(responseBody, HttpStatus.CREATED);
	}

	@GetMapping("/getAll") //get all information from the list/DB
	public ResponseEntity<List<Puppy>> getAllPuppies() {
		return ResponseEntity.ok(this.service.getPuppy()); //unneeded due to being the default of 200
	}

	@GetMapping("/get/{id}") // getPuppy with id of {id}
	public Puppy getPuppy(@PathVariable Integer id) {
		return this.service.getPuppy(id);
	}

	@PutMapping("/replace/{id}")
	public ResponseEntity<Puppy> replacePuppy(@PathVariable Integer id, @RequestBody Puppy newPuppy) {
		System.out.println("Replacing puppy with id: " + id + " with: " + newPuppy);
		Puppy body = this.service.replacePuppy(id, newPuppy);
		return new ResponseEntity<>(body, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<?> removePuppy(@PathVariable Integer id) {
		System.out.println("Removing puppy with id: " + id);
		boolean removed = this.service.removePuppy(id);
		if(removed) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		else {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}

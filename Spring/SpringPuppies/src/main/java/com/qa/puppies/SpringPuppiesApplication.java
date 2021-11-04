package com.qa.puppies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.puppies.domain.Puppy;

@SpringBootApplication
public class SpringPuppiesApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringPuppiesApplication.class, args);

		// Demo purpose only, this code would never exist in the main function
		ObjectMapper mapper = new ObjectMapper();

		Puppy demoPuppy = new Puppy("Sausage", "Daschund", 10);

		String demoPuppyAsJSON = mapper.writeValueAsString(demoPuppy);

		System.out.println(demoPuppyAsJSON);

		Puppy backToPuppy = mapper.readValue(demoPuppyAsJSON, Puppy.class);

		System.out.println(backToPuppy);

//		// SUPER DEMO PURPOSES
//		PuppyServiceList service = new PuppyServiceDB();
//		
//		PuppyController controller = new PuppyController(service);
	}

}

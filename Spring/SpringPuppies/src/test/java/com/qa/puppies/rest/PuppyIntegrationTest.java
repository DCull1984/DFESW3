package com.qa.puppies.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.puppies.domain.Puppy;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT) // Boots the ENTIRE Context
@AutoConfigureMockMvc // Creates the MockMvc object for sending our test requests
public class PuppyIntegrationTest {

	@Autowired
	private MockMvc mvc;

	@Autowired
	private ObjectMapper mapper; // Exact same mapper Spring uses to convert objects to and from JSON

	@Test
	void testCreate() throws Exception {
		Puppy requestBody = new Puppy("Rex", "G. Shepard", 44);

		String requestBodyAsJSON = this.mapper.writeValueAsString(requestBody);

		// set up the test request
		RequestBuilder request = post("/create").contentType(MediaType.APPLICATION_JSON).content(requestBodyAsJSON);

		Puppy responseAsBody = new Puppy("Rex", "G. Shepard", 44);
		String responseBodyAsJSON = this.mapper.writeValueAsString(responseAsBody);

		ResultMatcher checkStatus = status().isCreated(); // check status is 201
		ResultMatcher checkBody = content().json(requestBodyAsJSON); // check the body matches the example

		this.mvc.perform(request).andExpect(checkStatus).andExpect(checkBody); // performs request and checks the
																				// response
	}

}

package com.webservices.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class TestUsingWebAppContextSetUp extends RestWebserviceApplicationTests {

	@Autowired
	WebApplicationContext webContext;
	
	MockMvc mockMvc;
	
	@Before
	public void setUp(){
		
		mockMvc = MockMvcBuilders.webAppContextSetup(webContext).build();
	}
	//Added Comment by Plabon and should not be changed
	@Test
	public void validate_get_Address() throws Exception {
		
		mockMvc.perform(get("/address")).andExpect(status().isOk()).andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8)).andExpect(jsonPath("$.street").value("12345 Horton Ave"));
				

	}
	
}
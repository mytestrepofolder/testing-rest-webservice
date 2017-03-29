package com.webservices.test;

import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.webservices.test.contoller.AddressController;

public class TestUsingStandaloneSetup {
	
	 private  MockMvc mockMvc;
	 
	 @Before
	 public void setUp(){
		 mockMvc = MockMvcBuilders.standaloneSetup(new AddressController()).build();
	 }
	 
	 @Test
	 public void validate_getAddress_standAlone() throws Exception{
		 
		 mockMvc.perform(get("/address")).andExpect(status().isOk()).
		 andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)).
		 andExpect(jsonPath("$.street").value("12345 Horton Ave"));
		 
	 }
	 

}

package com.covid.restapi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

import com.covid.restapi.covid19dataserviceImpl.Covid19DataServiceImpl;
import com.covid.restapi.entity.CovidReport;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK)

class CovidTestController {

	
	  @Autowired private WebApplicationContext webApplicationContext;
	
	
	private MockMvc mockMvc;
	
	@Test
	public void covidTest() throws Exception {
		
		  System.out.println("Inside test");
		  mockMvc=MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		  mockMvc.perform(get("/retrieve")).andExpect(status().isOk()).andExpect(
		  content().contentType("application/json"));
		 
		
	}
}

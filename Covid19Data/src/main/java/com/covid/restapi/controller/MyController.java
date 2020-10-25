package com.covid.restapi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.function.ServerRequest.Headers;

import com.covid.restapi.covid19dataserviceImpl.Covid19DataServiceImpl;
import com.covid.restapi.entity.CovidReport;

@RestController
@CrossOrigin("*")
public class MyController {

	
	@Autowired
	Covid19DataServiceImpl covid19DataServiceImpl;
		  
		  @GetMapping("/retrieve")
		  public ResponseEntity<List<CovidReport>> getCovidReport()
		  {
		  
		  return covid19DataServiceImpl.getCovid19Data();
				
		  }
		 }

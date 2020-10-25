package com.covid.restapi.covid19dataserviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.covid.restapi.covid19dataserviceinterface.Covid19DataService;
import com.covid.restapi.entity.CovidReport;

@Service
public class Covid19DataServiceImpl implements Covid19DataService {

	@Autowired
	RestTemplate rs;
	
	@Override
	public ResponseEntity<List<CovidReport>> getCovid19Data() {
		
		String url="https://coronavirus-19-api.herokuapp.com/countries"; 
		
		  
		  
		  ResponseEntity<List<CovidReport>> response = rs.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<CovidReport>>() {
		});
		  List<CovidReport> list = response.getBody();
		  

		  //list.stream().limit(10).forEach(c->{System.out.println(c.getCountry());});
		  List<CovidReport> list2 = list.stream().limit(10).collect(Collectors.toList());
		 // list2.stream().forEach(c->{System.out.println(c.getCountry());});
		  return new ResponseEntity<List<CovidReport>>(list2, HttpStatus.OK);
	}

}

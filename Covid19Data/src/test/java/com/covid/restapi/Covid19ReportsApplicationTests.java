package com.covid.restapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan(basePackages = "com.covid.restapi.controller")
class Covid19ReportsApplicationTests {

	@Test
	void contextLoads() {
	}

}

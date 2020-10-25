package com.covid.restapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CovidReport {

	private String country;
	private int cases;
	private int todayCases;
	private int deaths;
	private int todayDeaths;
	private int recovered;
	private int active;
	private int critical;
	private int casePerOneMillion;
	private int deathsPerOneMillion;
	private int tests;
	private int testsPerOneMillion;
	
	
	
	public CovidReport() {
		super();
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public int getCases() {
		return cases;
	}



	public void setCases(int cases) {
		this.cases = cases;
	}



	public int getTodayCases() {
		return todayCases;
	}



	public void setTodayCases(int todayCases) {
		this.todayCases = todayCases;
	}



	public int getDeaths() {
		return deaths;
	}



	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}



	public int getTodayDeaths() {
		return todayDeaths;
	}



	public void setTodayDeaths(int todayDeaths) {
		this.todayDeaths = todayDeaths;
	}



	public int getRecovered() {
		return recovered;
	}



	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}



	public int getActive() {
		return active;
	}



	public void setActive(int active) {
		this.active = active;
	}



	public int getCritical() {
		return critical;
	}



	public void setCritical(int critical) {
		this.critical = critical;
	}



	public int getCasePerOneMillion() {
		return casePerOneMillion;
	}



	public void setCasePerOneMillion(int casePerOneMillion) {
		this.casePerOneMillion = casePerOneMillion;
	}



	public int getDeathsPerOneMillion() {
		return deathsPerOneMillion;
	}



	public void setDeathsPerOneMillion(int deathsPerOneMillion) {
		this.deathsPerOneMillion = deathsPerOneMillion;
	}



	public int getTests() {
		return tests;
	}



	public void setTests(int tests) {
		this.tests = tests;
	}



	public int getTestsPerOneMillion() {
		return testsPerOneMillion;
	}



	public void setTestsPerOneMillion(int testsPerOneMillion) {
		this.testsPerOneMillion = testsPerOneMillion;
	}



	/*
	 * @Override public String toString() { return "CovidReport [country=" + country
	 * + ", cases=" + cases + ", todayCases=" + todayCases + ", deaths=" + deaths +
	 * ", todayDeaths=" + todayDeaths + ", recovered=" + recovered + ", active=" +
	 * active + ", critical=" + critical + ", casePerOneMillion=" +
	 * casePerOneMillion + ", deathsPerOneMillion=" + deathsPerOneMillion +
	 * ", tests=" + tests + ", testsPerOneMillion=" + testsPerOneMillion + "]"; }
	 */
	
	
}

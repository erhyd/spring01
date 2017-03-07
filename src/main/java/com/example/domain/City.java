package com.example.domain;

import java.math.BigDecimal;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class City {

	private int id;
	private String name;
	private String countryCode;
	private String district;
	private BigDecimal population;
	
	private Country country;
	
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public City() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		String str= null;
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			str = mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return str;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param value the id to set
	 */
	public City setId(final int value) {
		id = value;
		return this;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param value the name to set
	 */
	public City setName(final String value) {
		name = value;
		return this;
	}


	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * @param value the district to set
	 */
	public City setDistrict(final String value) {
		district = value;
		return this;
	}

	/**
	 * @return the population
	 */
	public BigDecimal getPopulation() {
		return population;
	}

	/**
	 * @param value the population to set
	 */
	public City setPopulation(final BigDecimal value) {
		population = value;
		return this;
	}

	public String getCountry_code() {
		return countryCode;
	}

	public void setCountry_code(String country_code) {
		this.countryCode = country_code;
	}

}

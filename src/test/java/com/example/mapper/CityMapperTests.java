package com.example.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.City;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CityMapperTests {

	@Autowired
	CityMapper mapper;
	
	@Test
	public void test01_selectAll(){
		List<City> cities = mapper.selectAll("KOR");
		
		for(City c : cities)
			System.out.println(c);
	}
	
	@Test
	public void test02_selectAllWithCountry(){
		List<City> cities = mapper.selectAllWithCountry();
		
		for(City c : cities)
			System.out.println(c);
	}
}

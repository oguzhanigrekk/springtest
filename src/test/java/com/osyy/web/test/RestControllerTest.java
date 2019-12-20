package com.osyy.web.test;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.osyy.model.Users;

public class RestControllerTest {
	
	private RestTemplate restTemplate;
	
	@Before
	public void setUp() {
		restTemplate = new RestTemplate();
	}
	
	@Test
	public void testByName() {
	  ResponseEntity<Users> response = restTemplate.getForEntity("http://localhost:8080/rest/users/1", Users.class);
	  MatcherAssert.assertThat(response.getStatusCodeValue(), Matchers.equalTo(200));
	  MatcherAssert.assertThat(response.getBody().getName(), Matchers.equalTo("oguzhan"));
	}
	
	@Test
	public void testByEmail() {
	  ResponseEntity<Users> response = restTemplate.getForEntity("http://localhost:8080/rest/users/1", Users.class);
	  MatcherAssert.assertThat(response.getStatusCodeValue(), Matchers.equalTo(200));
	  MatcherAssert.assertThat(response.getBody().getName(), Matchers.equalTo("oguzhan"));
	}
	
	

}

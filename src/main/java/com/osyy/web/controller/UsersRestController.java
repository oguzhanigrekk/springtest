package com.osyy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.osyy.exception.UserNotFoundException;
import com.osyy.model.Users;
import com.osyy.service.UsersService;

@RestController
@RequestMapping("/rest")
public class UsersRestController {
	
	@Autowired
	private UsersService usersService;
	
	@RequestMapping(method = RequestMethod.GET,value = "/users")
	public ResponseEntity<List<Users>> getUsers(){
		
		List<Users> users = usersService.findUsers();
		return ResponseEntity.ok(users);
		
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/users/email={email}")
	public ResponseEntity<List<Users>> getEmails(@PathVariable("email") String email){
		List<Users> users = usersService.findByMail(email);
		return ResponseEntity.ok(users);
	}
	
	@RequestMapping(method= RequestMethod.GET, value ="/email" )
	public ResponseEntity<List<Users>> getMail(@RequestParam("email") String email){
		
		List<Users> users = usersService.findByMail(email);
		
		return ResponseEntity.ok(users);
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value ="/users/{id}")
	public ResponseEntity<Users> getUserId(@PathVariable("id") Long id){
		try {
			Users user = usersService.findUsers(id);
			return ResponseEntity.ok(user);
		} catch (UserNotFoundException e) {
			return ResponseEntity.notFound().build();
		}
	
		
		
		
	}

}

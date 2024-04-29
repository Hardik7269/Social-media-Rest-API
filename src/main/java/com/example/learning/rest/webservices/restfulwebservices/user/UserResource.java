package com.example.learning.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	protected UserDaoService service;
	
	public UserResource(UserDaoService userDao) {
		super();
		this.service = userDao;
	}


	@GetMapping("/users")
	public List<User> retriveAllUsers(){
		return service.findAllUser();
	}
	
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable int id){
		return service.findUserById(id);
	}
}

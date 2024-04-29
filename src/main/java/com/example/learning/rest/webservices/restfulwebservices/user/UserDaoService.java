package com.example.learning.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoService {

	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1, "Hardik", LocalDate.now().minusYears(21)));
		users.add(new User(2, "Chintan", LocalDate.now().minusYears(25)));
		users.add(new User(3, "Rakshit", LocalDate.now().minusYears(26)));
	}
	
	public List<User> findAllUser(){
		return users;
	}
	
	public User findUserById(Integer id) {
//		for (User user : users) {
//			if(user.getId() == id) {
//				return user;
//			}
//		}
//		return new User(null , null , null);
		//Functional Programming
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().get();
	}
}

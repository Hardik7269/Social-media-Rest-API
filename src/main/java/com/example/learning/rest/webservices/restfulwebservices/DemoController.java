package com.example.learning.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learning.rest.webservices.restfulwebservices.bean.DummyBean;

@RestController
public class DemoController {
	
	@GetMapping(path="/dummy")
	public String DumyMehtod() {
		return "Hello-World";
	}
	
	@GetMapping(path="/json")
	public DummyBean Dummy() {
		return new DummyBean("Message Is here");
	}
}

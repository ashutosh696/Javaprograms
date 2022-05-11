package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.Userservice;

@RestController
@RequestMapping("/user/api")
public class Usercontroller {

	@Autowired
	Userservice userservice;
	
	@GetMapping("/{id}")
	public User getuserById(@PathVariable int id) {
		User u= userservice.getById(id);
		
		return u;
	}
	
	@PostMapping("/")
	public boolean save(@RequestBody User user)
	{
		return userservice.save(user);
	}
}

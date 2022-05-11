package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.payloads.ApiResponse;
import com.example.demo.payloads.UserDto;
import com.example.demo.service.Userservice;

@RestController
@RequestMapping("/user/api")
public class Usercontroller {

	@Autowired
	Userservice userservice;
	
	@GetMapping("/{id}")
	public ResponseEntity<UserDto> getuserById(@PathVariable int id) {
	 
		
		return ResponseEntity.ok(userservice.getUserById(id));
	}
	
	@PostMapping("/")
	public ResponseEntity<UserDto> createuser(@RequestBody UserDto userdto)
	{
		
	UserDto	createuserdto=userservice.createuser(userdto);
				
		return new ResponseEntity<UserDto>(createuserdto,HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<UserDto> updateuser(@RequestBody UserDto userdto,@PathVariable int id)
	{
		
	UserDto	updateuserdto=userservice.updateuser(userdto,id);
				
		return  ResponseEntity.ok(updateuserdto); 
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<ApiResponse> deleteuser(@PathVariable int id) {
	 
		userservice.deleteuser(id);
		
		return new ResponseEntity<ApiResponse>(new ApiResponse("User deleted sucessfully", true),HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<UserDto>> getAllUsers() {
	 
		
		return ResponseEntity.ok(userservice.getAllUsers());
	}
	
}

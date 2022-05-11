package com.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.code.model.Course;
import com.code.service.Courseservice;
@RestController
@RequestMapping("/course")
public class Coursecontroller {
	@Autowired
	Courseservice Courseservice;
	
	@GetMapping("/id")
	public Course getById(@RequestParam(value="id", defaultValue ="1") int id)
	{
		return Courseservice.getById(id);
	}

	/*
	 * @RequestMapping(value="/name", method=RequestMethod.GET) public Course
	 * getByName(@RequestParam(value="name", defaultValue = "java") String name) {
	 * 
	 * return Courseservice.getByName(name); }
	 */
	
}

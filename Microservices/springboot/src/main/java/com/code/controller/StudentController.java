package com.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.code.model.Student;
import com.code.model.StudentDetails;
import com.code.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentservice;

	@GetMapping("/id")
	public StudentDetails getByid(@RequestParam(value="id", defaultValue = "1") int id)
	{
		System.out.println("ID- StudentController"+id);
		return studentservice.getById(id);
	}
	
	@RequestMapping(value="/name", method=RequestMethod.GET)
	public Student getByid(@RequestParam(value="name", defaultValue = "ashu") String name)
	{
		System.out.println("name- StudentController"+name);
		return studentservice.getByName(name);
	}
	@PostMapping("/save")
	public boolean saveStudent(@RequestBody(required = true) Student student)
	{
		
		return studentservice.save(student);
	}
}

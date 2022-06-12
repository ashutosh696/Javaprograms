package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ActionService;

@RestController
@RequestMapping("/unit")
public class ActionController {

	@Autowired
	ActionService actionService;
	
	@GetMapping("/test")
	public ResponseEntity<String> getAction()
	{
		
	String msg=	actionService.getAction();
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
		
		
	}
}

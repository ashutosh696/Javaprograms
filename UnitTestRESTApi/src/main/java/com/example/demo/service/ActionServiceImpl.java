package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ActionServiceImpl implements ActionService {

	@Override
	public String getAction() {
		 
		return "Keep Calm !!..";
	}

}

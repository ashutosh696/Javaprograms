package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.Userrepo;
import com.example.demo.service.Userservice;
@Service
public class UserserviceImpl implements Userservice {

	@Autowired
	Userrepo userrepo;
	@Override
	public User getById(int id) {
	User u=userrepo.findById(id).orElse(null);
		return u;
	}

	@Override
	public boolean save(User user) {
		 User u=userrepo.save(user);
		return false;
	}

	
}

package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.exceptions.ResourceNotFoundException;
import com.example.demo.model.User;
import com.example.demo.repository.Userrepo;

@Service
public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	Userrepo userrepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		User user=this.userrepo.findByEmail(username).orElseThrow(()->new ResourceNotFoundException("User","email"+username,0));
		return user;
	}

}

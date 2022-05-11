package com.example.demo.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exceptions.ResourceNotFoundException;
import com.example.demo.model.User;
import com.example.demo.payloads.UserDto;
import com.example.demo.repository.Userrepo;
import com.example.demo.service.Userservice;
@Service
public class UserserviceImpl implements Userservice {

	@Autowired
	Userrepo userrepo;
	@Autowired
	ModelMapper modalmapper;
	
	 

	public User dtoToUser(UserDto userdto)
	{
	User user=	modalmapper.map(userdto, User.class);
	
	return user;
		
	}
	
	public UserDto userToDto(User user)
	{
	UserDto userdto=	modalmapper.map(user, UserDto.class);
	
	return userdto;
		
	}

	@Override
	public UserDto getUserById(int id) {
		User u=userrepo.findById(id).orElseThrow(()->new ResourceNotFoundException("User","Id",id));
		
		return userToDto(u);
		 
	}

	@Override
	public UserDto createuser(UserDto userdto) {
		User user=this.dtoToUser(userdto);
		 User saveduesr=userrepo.save(user);
			return  this.userToDto(saveduesr);
	}

	@Override
	public UserDto updateuser(UserDto userdto, Integer id) {
		User u=userrepo.findById(id).orElseThrow(()->new ResourceNotFoundException("User","Id",id));
		u.setName(userdto.getName());
		u.setEmail(userdto.getEmail());
		u.setPassword(userdto.getPassword());
		
		User updateduser=this.userrepo.save(u);
		
		
		return userToDto(updateduser);
	}

	@Override
	public void deleteuser(Integer id) {
		User u=userrepo.findById(id).orElseThrow(()->new ResourceNotFoundException("User","Id",id));
		
		userrepo.deleteById(id);
		
	}

	@Override
	public List<UserDto> getAllUsers() {
	List<User> users= userrepo.findAll();
	List<UserDto> userdtos	=users.stream().map(user->userToDto(user)).collect(Collectors.toList());
		return userdtos;
	}
	
}

package com.example.demo.service;

import java.util.List;


import com.example.demo.payloads.UserDto;

public interface Userservice {

UserDto	getUserById(int id);
UserDto createuser(UserDto userdto);
UserDto updateuser(UserDto userdto, Integer id);
void deleteuser(Integer id);
List<UserDto> getAllUsers(); 

}

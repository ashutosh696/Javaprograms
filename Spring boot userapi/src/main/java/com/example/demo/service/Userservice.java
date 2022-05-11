package com.example.demo.service;

import com.example.demo.model.User;

public interface Userservice {

User	getById(int id);
boolean save(User user);
}

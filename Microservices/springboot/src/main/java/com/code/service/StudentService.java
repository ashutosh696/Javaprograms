package com.code.service;

import com.code.model.Student;
import com.code.model.StudentDetails;

public interface StudentService {

	StudentDetails	getById(int id);
Student getByName(String name);
boolean save(Student student);
}

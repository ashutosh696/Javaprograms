package com.code.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.stereotype.Service;

import com.code.model.Course;
import com.code.model.Student;
import com.code.model.StudentDetails;
import com.code.repository.StudentRepository;
import com.code.service.StudentService;

@Service
public class StudentserviceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	ApiCall apiCall;
	/*
	 * @Override public Student getById(int id) {
	 * System.out.println("ID- StudentserviceImpl"+id); Student
	 * s=studentRepository.findById(id).orElse(null);
	 * 
	 * return s; }
	 */

	   @Override 
	public StudentDetails getById(int id) {
	 
	   Student s=studentRepository.findById(id).orElse(null);
	   
	 Course c= apiCall.getCourseDetails(id);
	 StudentDetails sd=new StudentDetails();
	    BeanUtils.copyProperties(s, sd);
	    sd.setCourse(c);
	return sd; 
	   }
	 
	@Override
	public Student getByName(String name) {
		
		Student s=studentRepository.findByName(name);
		System.out.println("s- StudentserviceImpl"+s);
		return s;
	}

	@Override
	public boolean save(Student student) {
		studentRepository.save(student);
		System.out.println("Name-"+student.getId()+"ID- "+student.getName()+"Mobile no- "+student.getMobileNo());
		return false;
	}

	
}

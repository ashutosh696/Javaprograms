package com.code.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.model.Course;
//import com.code.repository.Courserepo;
import com.code.service.Courseservice;
@Service
public class CourseserviceImpl implements Courseservice{

	//@Autowired
	//Courserepo courserepo;
	
	@Override
	public Course getById(int id) {
		//Course c= courserepo.getById(id);
		Course c=new Course();
		c.setId(id);
		c.setName("Java");
		c.setDuration("1 year");
		return c;
	}

	 

}

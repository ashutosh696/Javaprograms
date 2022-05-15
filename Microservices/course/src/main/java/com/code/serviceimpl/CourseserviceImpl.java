package com.code.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.Span;
import org.springframework.stereotype.Service;

import com.code.model.Course;
//import com.code.repository.Courserepo;
import com.code.service.Courseservice;
 
@Service
public class CourseserviceImpl implements Courseservice{

	//@Autowired
	//Courserepo courserepo;
	private static final Logger logger= LoggerFactory.getLogger(CourseserviceImpl.class); 
	@Override
	public Course getById(int id) {
		//Course c= courserepo.getById(id);
		logger.info("logs before custom span");
		 
		Course c=new Course();
		c.setId(id);
		c.setName("Java");
		c.setDuration("1 year");
		return c;
	}

	 

}

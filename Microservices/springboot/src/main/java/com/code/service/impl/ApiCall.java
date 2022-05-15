package com.code.service.impl;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.code.model.Course;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
@Service
public class ApiCall {
	
	private static final Logger logger= LoggerFactory.getLogger(ApiCall.class); 

	@Autowired
	RestTemplate restTemplate;
	
	private static final String courseMicroserviceBaseUrl="http://course-service";
	
	@CircuitBreaker(name="example", fallbackMethod = "fallback")
	public Course getCourseDetails(int id)
	{
		logger.info("Calling course Microservices Api using RestTemplate");
		Course c=restTemplate.getForObject(courseMicroserviceBaseUrl+"/course/id?id={id}", Course.class,id);
		return c;
	}
	
	public Course fallback(Exception ex)
	{
		logger.info("Calling fallback and returing default course data");
		Course c=new Course();
		c.setId(1);
		c.setName("comman-course");
		c.setDuration("2 year");
		return c;
	}
}

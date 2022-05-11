package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserapiApplication.class, args);
	}
	
	@Bean
	public ModelMapper Modalmapper()
	{
		return new ModelMapper();
	}

}

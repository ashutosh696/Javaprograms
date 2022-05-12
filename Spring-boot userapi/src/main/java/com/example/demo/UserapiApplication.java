package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class UserapiApplication implements CommandLineRunner{

	@Autowired
	PasswordEncoder passwordEncoder;
	public static void main(String[] args) {
		SpringApplication.run(UserapiApplication.class, args);
	}
	
	@Bean
	public ModelMapper Modalmapper()
	{
		return new ModelMapper();
	}

	@Override
	public void run(String... args) throws Exception {
		 System.out.println(this.passwordEncoder.encode("xyz"));
		
	}

}

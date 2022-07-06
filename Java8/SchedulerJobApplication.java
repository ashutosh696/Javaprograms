package com.example.demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class SchedulerJobApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulerJobApplication.class, args);
	}

	@Scheduled(fixedRate =2000L)
	public void job() {
		System.out.println("Job "+new Date());
		
	}
	
	@Scheduled(cron ="*/2 * * * * *")
	public void job2() {
		System.out.println("Job2 "+new Date());
		
	}
	
}

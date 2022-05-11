package test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Java8TimeZone {

	public static void main(String[] args) {
		
		Instant nowutc=Instant.now();
		
		ZoneId asiasingapour=ZoneId.of("Asia/Singapore");
		
		ZonedDateTime zdt=ZonedDateTime.ofInstant(nowutc, asiasingapour);
		
		System.out.println(zdt);

	}

}

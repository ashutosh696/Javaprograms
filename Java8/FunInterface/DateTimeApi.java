package FunInterface;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

//Joda Api
public class DateTimeApi {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();//Immutable threadsafe
		
		LocalTime time = LocalTime.now();
	 
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println(date);
		System.out.println(time);
		System.out.println(dateTime);
		
		LocalDate birthDate = LocalDate.of(1990, Month.JULY, 7);
		Period period = Period.between(birthDate, date);
		System.out.print(period.getYears()+"-"+period.getMonths()+"-"+period.getDays());

	}

}

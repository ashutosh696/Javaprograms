package mypack166;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestBook {

	public static void main(String[] args) {
		 
		List<Book> booklist=new ArrayList<>();
		booklist.add(new Book(1,"A","B",2303));
		booklist.add(new Book(2,"S","N",1300));
		booklist.add(new Book(3,"D","M",2350));
		booklist.add(new Book(4,"F","Q",2100));
		booklist.add(new Book(6,"H","R",2360));
		
		Comparator<Book> sortByName=(b1,b2)->b1.getName().compareToIgnoreCase(b2.getName());
		Comparator<Book> sortByCost=(b1,b2)->Double.compare(b1.getCost(), b2.getCost());
		
		booklist.stream().sorted(sortByName.thenComparing(sortByCost)).forEach(System.out::println);
		
		booklist.stream().sorted(sortByName).forEach(System.out::println);
		
		booklist.stream().sorted(sortByCost).forEach(System.out::println);
		

	}

}

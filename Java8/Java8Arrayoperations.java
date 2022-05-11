package test;

import java.util.Arrays;

public class Java8Arrayoperations {

	public static void main(String[] args) {
		 int [] numbers=new int[] {4,7,1,2,3,9,8,5,6,4,5};
		 
		 Arrays.stream(numbers).sorted().forEach(System.out::print);
		 System.out.println("\n");
		 Arrays.stream(numbers).distinct().forEach(System.out::print);
		 System.out.println("\n");
		int max= Arrays.stream(numbers).max().getAsInt();
		 
		 int min= Arrays.stream(numbers).min().getAsInt();
		 System.out.println(max+"---------"+min);
		 
		 int sum=Arrays.stream(numbers).sum();
		 
	double avgd=	 Arrays.stream(numbers).average().getAsDouble();
	
	System.out.println(sum+"---------"+avgd);
	
	Arrays.stream(numbers).filter(i->i>5).map(i->i*i).forEach(System.out::println);
	}

}

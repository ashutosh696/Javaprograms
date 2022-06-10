package uhg;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxStream {

	public static void main(String[] args) {
		 
		List<Integer> list=Arrays.asList(2,1,5,3,7,4);
		
	System.out.println(list.stream().min(Integer::compare).get());	
	
	System.out.println(list.stream().max(Integer::compare).get());
		
	System.out.println(list.stream().sorted().findFirst().get());
	
	System.out.println(list.stream().reduce(Integer::min).get());
	
	System.out.println(list.stream().reduce(Integer::max).get());
	}

}

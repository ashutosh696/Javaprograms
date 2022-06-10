package uhg;

import java.util.*;
import java.util.stream.Collectors;
 

public class SquarsOfUniqueNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		
	List<Integer> uniquelist	= list.stream().distinct().collect(Collectors.toList());
	
	System.out.println("uniquelist"+uniquelist);

	List<Integer> squarelist	=uniquelist.stream().map(i->i*i).collect(Collectors.toList());
	
	System.out.println("squarelist"+squarelist);

	
	List<Integer> uniquelistsquare=list.stream().distinct().map(i->i*i).collect(Collectors.toList());
	
	System.out.println("uniquelistsquare"+uniquelistsquare);
	}

}

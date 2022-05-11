package thales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		  List list= Arrays.asList("star", "jupiter", "sun", "neptune", "earth", "saturn", "mars", "venus");
		  
		System.out.println(list.stream().filter(s->s.toString().length()>5).collect(Collectors.toList())); 

	}

}

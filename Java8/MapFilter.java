package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFilter {

	public static void main(String[] args) {
		List<String> numbers=Arrays.asList("1","2","3","4","5","6","7","8");
		
		List<Integer> even=numbers.stream().map(s-> Integer.valueOf(s)).filter(num->num%2==0).collect(Collectors.toList());
		System.out.println(even);
		
		List<String> lang=Arrays.asList("java","javascript","typescript","css");
		
		List<String> list=lang.stream().map(s->s.toUpperCase()).filter(e->e.startsWith("J")).collect(Collectors.toList());
		System.out.println(list);
	}

}

package hsbc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EvenDescStream {

	public static void main(String[] args) {

		int[] intArray= {2,3,5,7,9,8};
		String[] strarr={"A","B","C"};
		
		List<String> strlist=Arrays.asList(strarr);
		
		ArrayList<Integer> integerArray = (ArrayList<Integer>) Arrays.stream(intArray).boxed().filter(i->i%2==0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		ArrayList<Integer> integerArray1 = (ArrayList<Integer>) Arrays.stream(intArray).boxed().filter(i->i%2==0).sorted((o1,o2)->o2-o1).collect(Collectors.toList());
		
		System.out.println(integerArray);
		System.out.println(integerArray1);
		System.out.println(strlist);
	}

}

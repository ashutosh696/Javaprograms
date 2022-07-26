package ust;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparable {

	public static void main(String[] args) {
	List<Integer>	list =Arrays.asList(10,3,67,2,56);
	System.out.println("ArrayList maintain insertion order");
	System.out.println(list);
	System.out.println("After default sort asending");
	Collections.sort(list);
	System.out.println(list);
	System.out.println("After custom sort descending ");
	Collections.sort(list,(i1,i2)->(i1>i2)?-1:(i1<i2)?+1:0);
	System.out.println(list);
	}

}
 
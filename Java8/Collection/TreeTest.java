package ust;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeTest {

	public static void main(String[] args) {
		Set<Integer> set =new TreeSet<Integer>();
		set.add(3);
		set.add(1);
		set.add(2);
		set.add(5);
		set.add(7);
		set.add(9);
		set.add(8);
		set.add(6);
		System.out.println("By default sorting in natural ascending order");
		System.out.println(set);
	
		
		Set<Integer> set1 =new TreeSet<Integer>((i1,i2)->(i1>i2)?-1:(i1<i2)?+1:0);
		set1.add(3);
		set1.add(1);
		set1.add(2);
		set1.add(5);
		set1.add(7);
		set1.add(9);
		set1.add(8);
		set1.add(6);
		System.out.println("Custom sort descending order");
		System.out.println(set1);
		
		TreeMap<Integer, String> tm=new TreeMap<>();
		tm.put(3, "A");
		tm.put(1, "B");
		tm.put(2, "F");
		tm.put(6, "D");
		
		System.out.println(" By default KEY sorting in natural ascending order");
		System.out.println(tm);
		
		
	}

}

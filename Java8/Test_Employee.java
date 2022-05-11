package mypack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
	 
		
		List listemp=new ArrayList<Employee>();
		Employee e1=new Employee(1,"A",2000);
		Employee e2=new Employee(2,"B",5000);
		Employee e3=new Employee(3,"C",1000);
		
		listemp.add(e1);
		 
		listemp.add(e2);
		listemp.add(e3);
		
		List list=(List) listemp.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		
		System.out.println(list);
	}

}

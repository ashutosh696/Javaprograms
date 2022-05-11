package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		List<Employee> ls=new ArrayList<Employee>();
		Employee emp1=new Employee(1, "Ashu",10000);
		ls.add(emp1);
		ls.add(new Employee(2, "Ashutosh",13000));
		ls.add(new Employee(1, "Megha",8000));
List<Employee> emplist=		ls.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).collect(Collectors.toList());
		System.out.println(emplist);
		List<Employee> emplist2=		ls.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).limit(1).collect(Collectors.toList());
		System.out.println(emplist2);
		
		List<Employee> emplist3=		ls.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).skip(1).collect(Collectors.toList());
		System.out.println(emplist3);
		

	}

}

package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ListToMap {

	public static void main(String[] args) {
		 List<Student> list=new ArrayList<>();
		 list.add(new Student(1,"A"));
		 list.add(new Student(2,"B"));
		 list.add(new Student(3,"C"));

		 Map<Integer,String> map=new HashMap<Integer, String>();
		 
		 for(Student s:list)
		 {
			 map.put(s.getId(),s.getName());
		 }
		 
		for(Map.Entry<Integer, String> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+"--"+entry.getValue());
			
		}
		
		System.out.println(map);

	}

}


class Student
{
int id;
String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

}
package ust;

public class ClientStudent {

	public static void main(String[] args) {
		Student st=new Student(1,"Ashu");
		Student st1=new Student(1,"Ashu");
		
		//System.out.println(st.equals(st1)); false if not override equals() in Student class
		//Object class equals compare reference variable(Address)
		
		System.out.println(st.equals(st1)); //true

	}

}

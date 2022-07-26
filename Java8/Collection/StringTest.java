package ust;

public class StringTest {

	public static void main(String[] args) {
		String s="Ashu";//1 Object in SCP String Constant Pool
		
		String s1="Ashu"; // it refer to already created Object in SCP
		
		String s2=new String("Ashu");//Always create 1 object in Heap and 1 Object in SCP
		
		
		System.out.println(s==s1);
		
		System.out.println(s==s2);
		
		System.out.println(s.equals(s2));// String class override the Object class equals()
		
		
		StringBuffer sf=new StringBuffer("Ashu");
		StringBuffer sf1=new StringBuffer("Ashu");
		
		System.out.println(sf.equals(sf1));//StringBuffer does not override equals()
		
		

	}

}

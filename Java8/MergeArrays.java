package uhg;

public class MergeArrays {

	public static void main(String[] args) {
	 
	String	s1 = "abcdef";
	String	s2="pqrstuvw";

	StringBuilder sb=new StringBuilder();
	for(int i=0;i<s1.length()||i<s2.length();i++)
	{
		if(i<s1.length()) 
		sb.append(s1.charAt(i));
		
		if(i<s2.length()) 
			sb.append(s2.charAt(i));
		
		
	}
	
	System.out.println("Result-->"+sb.toString());
	}

}

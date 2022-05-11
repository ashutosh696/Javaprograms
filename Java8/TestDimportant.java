package coforge;

import java.util.HashMap;
import java.util.Map.Entry;

public class TestD {

	public static void main(String[] args) {
		 String s="Java";
		 //output a=2
		 
		char [] c =s.toCharArray();
		
		HashMap<String, Integer> map=new HashMap<>();
		

		
		
		  for(int i=0; i<c.length;i++) {
		  
		  if(map.containsKey(c)) 
			  map.put(""+c[i], map.get(c[i])+1);
		  else map.put(""+c[i], 1);
		  
		  }
		 
		  System.out.println(map.get("a"));
		   for(int j=0; j<s.length();j++)
		   {
			   System.out.println(map.get(c));
		   }
		   
		   
	}

}

package uhg;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CountEachChar {

	public static void main(String[] args) {
		 String s="aabbccddeerffy";
		 
		 LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
		 
	
		 
		char ch[]= s.toCharArray();
		
		for(char c:ch)
		{
			if(map.containsKey(c)) {
			map.put(c,map.get(c)+1);
			
			}
			else {
				map.put(c,1);
				  
			}
		}
		
		for(Map.Entry<Character,Integer> m:map.entrySet())
		{
			//System.out.println(m.getKey()+""+m.getValue());
			System.out.print(m.getKey());
			 
			 
		}
	 
			
		 
		 

	}

}

package uhg;

 
  import java.util.Iterator;
  import java.util.LinkedHashMap;
  import java.util.LinkedList;
  import java.util.List;
  import java.util.Map;

  public class UniqueCharRemoveDuplicate {

  	public static void main(String[] args) {
  		
  		UniqueCharRemoveDuplicate.display();
  	}

  	public static void display() {

  		String s="aabbccddeerffy";
  		//output--- ry
  		
		//String s="aabbccddeerrffyy";
  		//output--- abcderfy
  		
		//String s= "aabbccddeerffyy";
  	//output--- r
 		 
 		 
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
 		 
 			if( m.getValue()==1)
 			{
 				System.out.print(m.getKey());
 				 
 			} 
 			
 			 
 			 
 		}
 	 
 			
 		 
 		 

 	
	}
  }


	 
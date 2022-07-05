package hsbc;

import java.util.Map;
import java.util.TreeMap;

public class MergeTwoArray {

	public static void main(String[] args) {
		int[] a= {8,4,6,1,2};
		int[] b= {7,3,9,5};
		int[] c= new int[10];
		
		Map<Integer, Boolean> map=new TreeMap<>();
		
		for (int i : a) {
			
			map.put(i, true);
		}
		for (int i : b) {
			
			map.put(i, true);
		}
		int i=0;
		for(Map.Entry<Integer, Boolean> m:map.entrySet())
		{
			c[i]=(int)m.getKey();
			i++;
			
		}
		
		for (int j : c) {
			System.out.print(c[j]);
		}
	}

}

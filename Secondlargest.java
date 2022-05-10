package test;

import java.util.Arrays;

public class Secondlargest {

	public static void main(String[] args) {
		int a[]= {3,2,4,1,7,5};
		int l=a.length;
		printsecondlargestinarray(a,l);
	}

	  static void printsecondlargestinarray(int[] a, int l) {
		 
		  Arrays.sort(a);
		  
		  for(int i=l-2; i>=0;i--)
		  {
			  if(a[i]!=a[l-1])
			  {
				  System.out.println(a[i]);
				  return;
			  }
			  
		  }
	}

}

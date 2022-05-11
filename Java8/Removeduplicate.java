package test;

public class Removeduplicate {

	public static void main(String[] args) {
		int a[]= {2,2,3,3,4,4,5,5};
		int l=a.length;
		l=removeduplicate(a,l);
		for(int i=0;i<l;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	  static int removeduplicate(int[] a, int l) {
		 int j=0;
		 int temp[]=new int[l];
		 
		 if(l==0 ||l==1)
			 return l;
		 
		 for(int i=0;i<l-1;i++)
		 {
			 
			 if(a[i]!=a[i+1])
			temp[j++]= a[i];
		 } 
			 temp[j++]=a[l-1];
			for(int i=0;i<j;i++)
			{
				a[i]=temp[i];
			}
			 
		
		 
		return j;
	}

}

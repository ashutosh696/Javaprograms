package uhg;

public class FindIndex {

	public static void main(String[] args) {
		int[] a=new int[] {12,23,34,45,56,67,78,89,90,99};
		
		int target=99;
		
		System.out.println(FindIndex.getIndex(a, target));
		

	}
	
	public static int getIndex(int a[], int target)
	{
		
		int length=a.length;
		int j=0;
		for(int i=0;i<length;i++)
		{
			
			if(a[i]==target) {
				j=i;
				break;
			
			}
		}
		return j;
	}

}

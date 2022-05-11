package test;

public class Countfrequecyinarray {
//driver program
	public static void main(String[] args) {
		int arr[]= {0,5,5,5,4,4};
		int x=4;
		int l=arr.length;
		
		System.out.println(frequency(arr,x,l));

	}

  static int frequency(int[] arr, int x, int l) {
	 int count=0;
	 for(int i=0;i<l;i++)
	 {
		 if(arr[i]==x)
		 {
			 count++;
		 }
	 }
	return count;
}

}

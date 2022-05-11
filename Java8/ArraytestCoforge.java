package test;

public class ArraytestCoforge {

	public static void main(String[] args) {
		// output= [[-3,3],[-2,2]]
				 int a[]= {-4,-3,-2,-1,0,2,3};
				 
				 for(int i=0;i<a.length;i++)
				 {
					 int temp=a[i];
					 for(int j=0;j<a.length;j++) {
 			 if(temp+a[j]==0&&(temp==-3||temp==-2))
 				 {
						 System.out.println("["+temp+","+a[j]+"]");
 				 }
					 }
				 }

	}

}

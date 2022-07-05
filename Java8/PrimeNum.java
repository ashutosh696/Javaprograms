package hsbc;

public class PrimeNum {

	public static void main(String[] args) {
	int n=17;
	//int n=18;
	int flag=0;
		if(n==0||n==1)
		{
			System.out.println(n+" is not Prime number");
			
		}	
		else
		{
			for (int i = 2; i < n; i++) {
				if(n%i==0)
				{
					System.out.println(n+" is not Prime number");
					
					flag=1;
					break;
				}
			}
			
		}
		if(flag==0)
			System.out.println(n+" is Prime number");	

	}

}

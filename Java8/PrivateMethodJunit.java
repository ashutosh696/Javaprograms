package hsbc;

public class PrivateMethodJunit {

	private int sum(Integer a,Integer  b) {
		
		return a+b;
		
	}

	public int  sumTwo(int a,int b) {
		//return a+b;
		
		return sum(a,b);
	}
	
}
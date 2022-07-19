package FunInterface;

public class MethodRef {

	public static void main(String[] args) {
		
		//lambda
		  Runnable ru=()->{ for (int i = 0; i < 5; i++) { System.out.println("--"+i); }
		  };
		  Thread th=new Thread(ru);
			th.start();
	  
		
		//Method Reference
		Runnable r=new A()::m;
		
		Thread t=new Thread(r);
		t.start();
		

	}

}

class A
{
	//code Reusability
public void m() {
	for (int i = 0; i < 5; i++) {
		System.out.println("--"+i);
	}
	
}	
}
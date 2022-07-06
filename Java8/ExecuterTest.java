package ExecuterThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterTest {

	public static void main(String[] args) {
		 ExecutorService service=Executors.newFixedThreadPool(2);
		 
		
			 Runnable runnable=new Runnable() {
					
					@Override
					public void run() {
						System.out.println("hello");
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							 
							e.printStackTrace();
						}
						
						
					}
				};
				
				 for (int i = 0; i < 5; i++)
				 {
				 service.execute(runnable);
				 }
		 

	}

}

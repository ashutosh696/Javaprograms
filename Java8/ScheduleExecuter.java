package ExecuterThread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleExecuter {

	public static void main(String[] args) {
		 
		Task t=new Task();
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.schedule(t, 2,TimeUnit.SECONDS);
		service.shutdown();
	}

}

class Task implements Runnable
{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}
	
}
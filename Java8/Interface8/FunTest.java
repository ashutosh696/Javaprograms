package Interface8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

@FunctionalInterface
interface AB{
	public void name();
	
}

public abstract class FunTest implements AB {

	public static void main(String[] args) {
		 

			AB a=()->System.out.println("implementation of abstract method");  //Lambda expression Anonymous method
			
			a.name();
					 
			List<String> list=Arrays.asList("V","a","h","d");
			
			list.forEach(System.out::println);//Method reference  Call by Method
			
			list.forEach((s)->System.out.println(s));//Lambda expression
			
			//Consumer(Interface)
			Consumer<String> con=new Consumer<String>() {
				
				@Override
				public void accept(String t) {
					 
					System.out.println(t);
				}
			};//Anonymous Class    
			
			list.forEach(con);
	}

	 
	
}


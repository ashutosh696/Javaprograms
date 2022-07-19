package FunInterface;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FISAM {

	public static void main(String[] args) {
		 
		Function<Integer, Integer> f=i-> i*i;
		
		System.out.println(f.apply(5));//int
		
		
		Predicate<Integer> p=i->i%2==0;
		
		System.out.println(p.test(5));//Boolean
		
		
		Consumer<String> c=(i)->System.out.println(i);
		
		c.accept("ABC");//void
		

		Supplier<Object> s=()->new Date();
		
		System.out.println(s.get());//Obj
	}

}

 
	
 
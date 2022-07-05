import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

import hsbc.PrivateMethodJunit;

public class PrivateJunit {

	@Test
	public void testsum() {
		
		PrivateMethodJunit pObj= new PrivateMethodJunit();
		int sum=pObj.sumTwo(2, 4);
		
		assertEquals(6, sum);
	}
	  
	@Test
	public void testsumReflection() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Method method=PrivateMethodJunit.class.getDeclaredMethod("sum", Integer.class,Integer.class);
		method.setAccessible(true);
		PrivateMethodJunit pObj= new PrivateMethodJunit();
	int sum=(int) method.invoke(pObj, 2,3);
	assertEquals(5, sum);
		
	}
}

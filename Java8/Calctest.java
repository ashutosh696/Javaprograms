package unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Calctest {

	@Test
	public void testAdd() {
		
		int expected=10;
		int actual=Caculator.add(4, 6);
		
		assertEquals(expected, actual);
	}
	
}

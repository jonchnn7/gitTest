import static org.junit.Assert.*;

import org.junit.Test;

public class lab1FunctionsTest {

	@Test
	public void testMultiplyPass() {
		assertEquals(20, lab1Functions.multiply(4,5));
	}
	
	@Test
	public void testMultiplyFail() {
		assertEquals(18, lab1Functions.multiply(4, 5));
	}

	@Test
	public void testConcatPass() {
		assertEquals("45", lab1Functions.concat(4,5));
	}
	
	@Test
	public void testConcatFail() {
		assertEquals("4 6", lab1Functions.concat(4, 5));
	}

}

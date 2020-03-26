package testclasses;

import codeundertest.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestRemainder {

	@Test
	public void testRemDouble () {
		assertEquals(0.0, Calculator.calculate('%', 12.5, 12.5), Calculator.delta);
		assertEquals(123.45, Calculator.calculate('%', 123.45, -678.90), Calculator.delta);
		assertEquals(0.99977, Calculator.calculate('%', 10987.14, 3.14159), Calculator.delta);
	}
	
	@Test
	public void testRemInts() {
		assertEquals(0.0, Calculator.calculate('%', -12, -12), Calculator.delta);
		assertEquals(-53.0, Calculator.calculate('%', -678, 125), Calculator.delta);
		assertEquals(1809.0, Calculator.calculate('%', 1809, -9320), Calculator.delta);
	}

}

package testclasses;

import codeundertest.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestSubtractions {

	@Test
	public void testSubDouble () {
		assertEquals(0.0, Calculator.calculate('-', 12.5, 12.5), Calculator.delta);
		assertEquals(802.35, Calculator.calculate('-', 123.45, -678.90), Calculator.delta);
		assertEquals(10983.99, Calculator.calculate('-', 10987.14, 3.14159), Calculator.delta);
	}
	
	@Test
	public void testSubInts() {
		assertEquals(-12.0, Calculator.calculate('-', -24, -12), Calculator.delta);
		assertEquals(-803.0, Calculator.calculate('-', -678, 125), Calculator.delta);
		assertEquals(11129.0, Calculator.calculate('-', 1809, -9320), Calculator.delta);
	}

}

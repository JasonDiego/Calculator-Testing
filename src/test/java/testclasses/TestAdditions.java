package testclasses;

import codeundertest.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestAdditions {

	@Test
	public void testAddDoubles() {
		assertEquals(25.0, Calculator.calculate('+', 12.5, 12.5), Calculator.delta);
		assertEquals(555.45, Calculator.calculate('+', -123.45, 678.90), Calculator.delta);
		assertEquals(10990.28159, Calculator.calculate('+', 10987.14, 3.14159), Calculator.delta);
	}
	
	@Test
	public void testAddInts() {
		assertEquals(-24.0, Calculator.calculate('+', -12, -12), Calculator.delta);
		assertEquals(250.0, Calculator.calculate('+', 125, 125), Calculator.delta);
		assertEquals(-7511.0, Calculator.calculate('+', 1809, -9320), Calculator.delta);
	}

}

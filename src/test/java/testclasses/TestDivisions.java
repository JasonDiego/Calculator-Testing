package testclasses;

import codeundertest.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestDivisions {

	@Test
	public void testDivDouble () {
		assertEquals(2.0, Calculator.calculate('/', 25.0, 12.5), Calculator.delta);
		assertEquals(-0.1818, Calculator.calculate('/', 123.45, -678.90), Calculator.delta);
		assertEquals(3497.32, Calculator.calculate('/', 10987.14, 3.14159), Calculator.delta);
	}
	
	@Test
	public void testDivInts() {
		assertEquals(0.0, Calculator.calculate('/', -12, -12), Calculator.delta);
		assertEquals(-5.424, Calculator.calculate('/', -678, 125), Calculator.delta);
		assertEquals(0.194, Calculator.calculate('/', 1809, 9320), Calculator.delta);
	}

}

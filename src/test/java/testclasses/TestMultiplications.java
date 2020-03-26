package testclasses;

import codeundertest.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestMultiplications {

	@Test
	public void testMultDouble () {
		assertEquals(156.25, Calculator.calculate('*', 12.5, 12.5), Calculator.delta);
		assertEquals(-83810.205, Calculator.calculate('*', 123.45, -678.90), Calculator.delta);
		assertEquals(34517.09, Calculator.calculate('*', 10987.14, 3.14159), Calculator.delta);
	}
	
	@Test
	public void testMultInts() {
		assertEquals(144.0, Calculator.calculate('*', -12, -12), Calculator.delta);
		assertEquals(-84750.0, Calculator.calculate('*', -678, 125), Calculator.delta);
		assertEquals(-1685988.0, Calculator.calculate('*', 1809, -932), Calculator.delta);
	}

}

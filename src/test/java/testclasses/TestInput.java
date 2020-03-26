package testclasses;

import codeundertest.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestInput {

	@Test
	public void testIllegalChars() {
		assertNull(Calculator.calculate('&', 1.0, 1.0));
		assertNull(Calculator.calculate('|', 1.0, 1.0));
		assertNull(Calculator.calculate(' ', 1.0, 1.0));
		assertNull(Calculator.calculate(';', 1.0, 1.0));
		assertNull(Calculator.calculate('=', 1.0, 1.0));
	}

}

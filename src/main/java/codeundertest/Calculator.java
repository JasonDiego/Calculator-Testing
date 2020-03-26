package codeundertest;

import java.io.IOException;

public class Calculator {
	
	public static final int delta = 2;
	
	public static Double calculate(char operator, double op1, double op2) {
		
		double result;
		
		System.out.print(op1 + " " + operator + " " + op2 + " = ");
		
		try {
			switch (operator) {
				case '+':
					result = op1 + op2;
					break;
				case '-':
					result = op1 - op2;
					break;
				case '*':
					result = op1 * op2;
					break;
				case '/':
					if (op2 == 0) { throw new ArithmeticException(); }
					result = op1 / op2;
					break;
				case '%':
					result = op1 % op2;
					break;
				default: throw new IllegalArgumentException();
			}
		}
		catch (IllegalArgumentException e) {
			System.out.println("ERROR\nInvalid operator!");
			return null;
		}
		catch (ArithmeticException e) {
			System.out.println("ERROR\nCannot divide by zero!");
			return null;
		}

		System.out.println(result);
		return result;
	}
	
}

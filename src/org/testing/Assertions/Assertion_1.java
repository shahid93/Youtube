package org.testing.Assertions;

public class Assertion_1 {

	public static void assertion(String actual ,String exp) {
		
		if(actual.equals(exp)) {
			
			System.out.println("Assertion is passed");
			
		}
		else {
			
			System.out.println("Assertion is failed");
		}
		
	}
	
}

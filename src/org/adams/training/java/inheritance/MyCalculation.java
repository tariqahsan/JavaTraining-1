package org.adams.training.java.inheritance;

public class MyCalculation extends Calculation {

	public static void main(String args[]) {

		int a = 20, b = 10;
		
		
		MyCalculation demo = new MyCalculation();
		demo.addition(a, b);
		demo.subtraction(a, b);
		demo.multiplication(a, b);

	}
	
	public void multiplication(int x, int y) {
		int z = x * y;
		System.out.println("The product of the given numbers from subclass:" + z);
		
	}

	
}

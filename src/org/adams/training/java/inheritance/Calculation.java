package org.adams.training.java.inheritance;

public class Calculation {
	
	private int z;
	
	public int a;

	public void addition(int x, int y) {
		z = x + y;
		System.out.println("The sum of the given numbers:" + z);
	}

	public void subtraction(int x, int y) {
		z = x - y;
		System.out.println("The difference between the given numbers:" + z);
	}
	
	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("The product of the given numbers from superclass:" + z);
	}
}

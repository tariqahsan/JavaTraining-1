package org.adams.training.java.inheritance;

public class SubClass extends SuperClass {
	
	private int num = 10;
	
	public static void main(String args[]) {
		SubClass obj = new SubClass();
		obj.myMethod();
	}

	// display method of subClass class
	public void display() {
		System.out.println("This is the display method of subclass");
	}

	public void myMethod() {
		
		// Instantiating subclass
		SubClass subClass = new SubClass();

		// Invoking the display() method of subClass class
		subClass.display();

		// Invoking the display() method of superclass
		super.display();

		// printing the value of variable num of subClassclass
		System.out.println("value of the variable named num in subClass class:" + subClass.num);

		// printing the value of variable num of superclass
		System.out.println("value of the variable named num in super class:" + super.num);
	}

}

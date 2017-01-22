package org.adams.training.java.abstraction;

// You can’t create objects to abstract class even 
// though it does not contain any abstract methods.
public class AbstractClassWoAbstractMethods {
	
	public static void main(String[] args)
    {
		//Compile time error
		AbstractClass abstractClass = new AbstractClass2();
       
    }

}

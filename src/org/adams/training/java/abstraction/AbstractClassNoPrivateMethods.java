package org.adams.training.java.abstraction;

/*
 * Abstract methods can not be private. Because, abstract 
 * methods must be implemented somehow in the sub classes. 
 * If you declare them as private, then you can’t use them 
 * outside the class.
 */
public abstract class AbstractClassNoPrivateMethods {
	
	// Compile time error, abstract method can not be private.
	private abstract void abstractMethodOne();
   

}

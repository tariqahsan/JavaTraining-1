package org.adams.training.java.interfaces;

/*
 * As we know any class in Java can not extend more than one class. 
 * But class can implement more than one interface. 
 * This is how multiple inheritance is implemented in Java
 */
public class AnyClass10 {
	
	public void methodOne()
    {
		// Method of first interface is implemented
    }
 
    // Method of Second interface must also be implemented.
    // Otherwise, you have to declare this class as abstract.
    public void methodTwo()
    {
        // Now, method of Second interface is also implemented.
        // No need to declare this class as abstract
    }

}

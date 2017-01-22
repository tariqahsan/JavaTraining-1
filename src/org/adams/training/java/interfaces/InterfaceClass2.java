package org.adams.training.java.interfaces;

/*
 *  Interfaces should contain only abstract methods. Interfaces should not contain any concrete method.
 */
public interface InterfaceClass2 {
	    
		abstract void abstractMethodOne();  //abstract method	 
	    abstract void abstractMethodTwo();  //abstract method
	 
	    // Compile Time Error.
        // Concrete Methods are not allowed in interface
	    
	    void concreteMethod()
	    {
	        
	    }

}

package org.adams.training.java.interfaces;

/*
 * SIB – Static Initialization Block and 
 * IIB – Instance Initialization Block are not 
 * allowed in interfaces
 */
public interface InterfaceClass9 {
	
    // Compile time error
    // SIB's are not allowed in interfaces
	static
    {
		
    }
 
    {
        // Here also compile time error.
        // IIB's are not allowed in interfaces
    }
    
    void methodOne();  //abstract method

}

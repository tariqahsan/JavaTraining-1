package org.adams.training.java.abstraction;

/*
 * Constructors and fields can not be declared as abstract.
 */
public abstract class AbstractClassConstructorAndField {
	
	// Compile time error, field can not be abstract
	abstract int i;
    
	// Compile time error, constructor can not be abstract
    abstract AbstractClass()
    {
        
    }

}

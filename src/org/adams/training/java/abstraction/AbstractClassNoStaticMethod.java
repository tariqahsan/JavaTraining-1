package org.adams.training.java.abstraction;

// Abstract methods can not be static.
public abstract class AbstractClassNoStaticMethod {
	
	// Compile time error, abstract methods can not be static
	static abstract void abstractMethod();
    

}

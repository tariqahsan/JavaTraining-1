package org.adams.training.java.interfaces;

/*
 * By default, Every field of an interface is public, static and final.
 * You can’t use any other modifiers other than these three for a field 
 * of an interface.
 */
public interface InterfaceClass4 {
	
	// By default, field is public, static and final
	int i = 0;
 
    // Following statements give compile time errors
    private double d = 10;
    protected long l = 15;

}



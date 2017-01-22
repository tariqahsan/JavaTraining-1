package org.adams.training.java.abstraction;

/*
 * Inside abstract class, we can keep any number of constructors.
 * If you are not keeping any constructors, then compiler will keep 
 * default constructor. 
 */
public abstract class AbstractClassConstructor {
	
	public AbstractClassConstructor()
    {
        //First Constructor
    }
 
	public AbstractClassConstructor(int i)
    {
        //Second Constructor
    }
 
    abstract void abstractMethodOne();  //Abstract Method

}


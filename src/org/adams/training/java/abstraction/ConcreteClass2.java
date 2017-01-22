package org.adams.training.java.abstraction;

public class ConcreteClass2 extends AbstractClassMustImplementAbstractMethod2{
	void abstractMethodOne() {
        //abstractMethodOne() is implemented
    }
    // This class must implement second abstract method also,
    // otherwise, this class has to be declared as abstract 
    void abstractMethodTwo(){
        // abstractMethodTwo() is also implemented.
        // No need to declare this class as abstract
    }
}


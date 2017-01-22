package org.adams.training.java.abstraction;

public class Abstraction {

	public static void main(String[] args) {

		// AbstractClass A = new AbstractClass();  Can't create objects to Abstract class
        ConcreteClass concreteClass = new ConcreteClass();
        
        /* ConcreteClass implements abstract method,
         * so we can create object to ConcreteClass
         * 
         * ConcreteClass object is auto-upcasted to AbsractClass
         */
        AbstractClass abstractClass = concreteClass;
        abstractClass.abstractMethod();
	}

}



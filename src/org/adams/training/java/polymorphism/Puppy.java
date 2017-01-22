package org.adams.training.java.polymorphism;

/*
 * Java Runtime Polymorphism with Multilevel Inheritance
 */
public class Puppy extends Dog{
	  
	public static void main(String args[]){  
	
	Animal a1, a2, a3;  
	a1 = new Animal();  
	a2 = new Dog();  
	a3 = new Puppy();  
	a1.eat();
	a2.eat();
	a3.eat(); 

	  
	}  
	
	public void eat(){
		
		System.out.println("drink milk");
	}  
}  

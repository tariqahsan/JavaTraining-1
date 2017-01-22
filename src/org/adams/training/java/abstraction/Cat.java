package org.adams.training.java.abstraction;

public class Cat extends Animal {

	public static void main(String[] args) {
		
		Animal animal = new Cat();
		animal.typeOfAnimal("Cat");
		animal.soundOfAnimal();

	}

	@Override
	void soundOfAnimal() {
		System.out.println("Meow");
		
	}

}






package org.adams.training.java.abstraction;

public class Cow extends Animal {

	public static void main(String[] args) {
		
		Animal animal = new Cow();
		animal.typeOfAnimal("Cow");
		animal.soundOfAnimal();

	}

	@Override
	void soundOfAnimal() {
		System.out.println("Moo");
		
	}

}



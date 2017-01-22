package org.adams.training.java.interfaces;

public class Circle implements Shape{

	public static void main(String[] args) {
		
		Shape circle = new Circle();
		circle.draw();

	}

	@Override
	public void draw() {
		
		System.out.println("Drawing a circle");
		
	}

}

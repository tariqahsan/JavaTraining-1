package org.adams.training.java.statics;

public class Vehicle {

//	public static final Integer speedLimit = 80; // Make it a constatnt
	public static final Integer speedLimit = 80;
	
	public static void checkIfOverSpeedLimit(Integer currentSpeed) {
		if(currentSpeed > speedLimit) {
			System.out.println("Slow down! Your're over the limit by " + (currentSpeed - speedLimit));
		} else {
			System.out.println("Go faster, you're only going " + currentSpeed);
		}
	}

}

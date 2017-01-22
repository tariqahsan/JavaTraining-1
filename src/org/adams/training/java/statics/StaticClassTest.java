package org.adams.training.java.statics;

public class StaticClassTest {

	public static void main(String[] args) {
		
		// No need to instantiate an object of a class in order to
		// access the static method/variable that belongs to the class.
		// Static methods are often used as 'helper' methods.
		//Vehicle.speedLimit++;
		
		// Also, here Variable.speedLimit is like a Global variable
		Vehicle.checkIfOverSpeedLimit(70);
		Vehicle.checkIfOverSpeedLimit(100);
		
		Vehicle car = new Vehicle();
		
		// Compiler complains with a warning but it'll run. Not recommended
		car.checkIfOverSpeedLimit(70);
	}

}

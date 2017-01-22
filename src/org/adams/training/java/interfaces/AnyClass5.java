package org.adams.training.java.interfaces;

public class AnyClass5 implements InterfaceClass5 
{
	void methodOne()
    {
        // Following statement gives compile time error.
		// final field can not be re-assigned
        //InterfaceClass5.i = 10;
		int x = 100;
		System.out.println(x + InterfaceClass5.i);
		System.out.println();
    }
}

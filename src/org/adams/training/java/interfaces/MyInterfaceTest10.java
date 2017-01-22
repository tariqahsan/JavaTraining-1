package org.adams.training.java.interfaces;

public class MyInterfaceTest10 implements InterfaceClass10One, InterfaceClass10Two{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * This method takes a value of name
	 * @param value
	 * @return
	 */
	public String getValue(String value) {
		
		String val1 = "This is test";
		String val2 = val1 + value;
		return val2;
	}

}

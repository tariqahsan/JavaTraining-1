package org.adams.training.java.exception;

import java.util.ArrayList;
import java.util.List;

/*
 * http://javarevisited.blogspot.com/2011/06/noclassdeffounderror-exception-in.html
 */

public class NoClassDefFoundErrorDemo {

	public static void main(String args[]) {
		List<User> users = new ArrayList<User>();

		for (int i = 0; i < 2; i++) {

			try {
				
				// Will throw NoClassDefFoundError
				users.add(new User(String.valueOf(i)));
														

			} catch (Throwable t) {

				t.printStackTrace();
			}
		}
	}
}

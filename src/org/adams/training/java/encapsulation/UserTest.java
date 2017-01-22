package org.adams.training.java.encapsulation;

public class UserTest {

	public static void main(String[] args) {
		
		User user = new User();
		user.setId(1234);
		user.setUserName("tariqahsan");
		user.setPassword("mypassword");
		
		System.out.println(user.getUserName());
		if (user.getUserName().equals("admin")) {
			System.out.println(user.getPassword());
		} else {
			System.out.println("You are not authorized to view the password");
		}

	}

}

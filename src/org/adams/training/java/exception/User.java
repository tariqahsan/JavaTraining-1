package org.adams.training.java.exception;

public class User {
	
	private static String userId = getUserId();
	
	public User(String id){
	       this.userId = id;
	   }
	   private static String getUserId() {
	       throw new RuntimeException("UserId Not found");
	   } 

}

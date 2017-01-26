package org.adams.training.java.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * Checked Exception Demo
 * 
 * If we use FileReader class in our program to read data from a file, 
 * if the file specified in its constructor doesn't exist, then a 
 * FileNotFoundException occurs, and the compiler prompts the programmer 
 * to handle the exception.
 */
public class FileNotFoundDemo2 {
	
	public static void main(String args[]) {		
	      File file = new File("C://file.txt");
	      try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Here'e the generated stacktrace ...");
			e.printStackTrace();
		} 
	   }

}

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
public class FileNotFoundDemo1 {
	
	public static void main(String args[]) throws FileNotFoundException {		
	      File file = new File("C://file.txt");
	      FileReader fr = new FileReader(file); 
	   }

}

package org.adams.training.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BookMain {

	public static void main(String[] args) {

		List<Book> books = Arrays.asList(
				new Book("0-545-01022-5", "Fundamentals of Objected Oriented Programming", "Computer SCience", null), 
				new Book("0-545-01029-9", "Basic Java", "Computer SCience", null)
		);
		
		List<Author> authors = Arrays.asList(
				new Author(100, "Arthur Conan Doyle", "arthur@gmail.com", "Male"),
				new Author(200, "Mohammed Abu Daud", "daud@yahoo.com", "Male"),
				new Author(300, "Ayesha Siddiqui", "ayesh@gmail.com", "Female"),
				new Author(400, "Zubair Hassan", "hassan@gmail.com", "Male"),
				new Author(500, "Farzeen Ahsan", "farzeen@gmail.com", "Female")
		);
		
		books.stream().forEach(System.out::println);
				
		List<String> authorNames = authors.stream()
        .map( name -> name.getName()) 
        .distinct()
        .collect(Collectors.toList());

		System.out.println(authorNames);
	}

}

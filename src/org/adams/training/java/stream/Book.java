package org.adams.training.java.stream;

import java.util.List;

public class Book {
	
	private String isbn;
	private String title;
	private String topic;
	private List<Author> authors;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String isbn, String title, String topic, List<Author> authors) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.topic = topic;
		this.authors = authors;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", topic=" + topic + ", authors=" + authors + "]";
	}
	
}

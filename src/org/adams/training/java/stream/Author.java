package org.adams.training.java.stream;

public class Author {
	
	private long id;
	private String name;
	private String email;
	private String gender;
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(long id, String name, String email, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	
}

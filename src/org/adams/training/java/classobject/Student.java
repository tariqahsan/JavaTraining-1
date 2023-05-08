package org.adams.training.java.classobject;

public class Student {
	
	public Student() {
		// No arg constructor
	}
	
	public Student(int studentId, String name) {
		super();
		this.studentId = studentId;
		this.name = name;
		System.out.println("Hello from " + studentId + " " + name);
	}
	
	// Declare a variable
	private int studentId;
	public String name;
	private String course;
	private String grade;
	
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	

}

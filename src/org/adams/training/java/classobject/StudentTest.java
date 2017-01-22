package org.adams.training.java.classobject;

import org.adams.training.java.classobject.Student;

public class StudentTest {
	

	public static void main(String[] args) {
		
		Student student = new Student();
		Student student2 = new Student(123, "CENTER");
		
		student.setStudentId(1234);
		student.setName("John Doe");
		student.setCourse("CS100");
		student.setGrade("A");
		
		System.out.println("Name : " + student.getName() + " \nCourse : " + student.getCourse() +  " \nGrade : " + student.getGrade());
		
		String banana = "Hello World"; // Local Variable
		

	}

}

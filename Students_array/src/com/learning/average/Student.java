package com.learning.average;

import java.util.Scanner;

public class Student {
	private String name;
	private String lastName;
	private Double grade;
	private Integer studentId;
	private Boolean newStudent;
//Created two constructor, one that is empty and the other one receives all attributes to create a new student
	Student(String name, String lastName, Double grade, Integer id, Boolean newStudent) {
		this.name = name;
		this.lastName = lastName;
		this.grade = grade;
		this.studentId = id;
		this.newStudent = newStudent;

	}
	
	Student(){
		
	}
//A print method to show students info
	public void print() {
		System.out.println("Name: " + this.name);
		System.out.println("Last Name: " + this.lastName);
		System.out.println("Grade: " + this.grade);
		System.out.println("Student Id: " + this.studentId);
	}

//A method to add student to an array 
	public Student[] addStudent(Student[] arr, Scanner scanner, Integer studentCount) {
		System.out.println("Please, complete the student information");
		System.out.println("Enter student name:");
		this.name = scanner.next();
		System.out.println("Enter student last name:");
		this.lastName = scanner.next();
		System.out.println("Ente student id:");
		this.studentId = scanner.nextInt();
		System.out.println("Is this a new student?");
		this.newStudent= scanner.nextBoolean();
		System.out.println("Enter student grade");
		this.grade = scanner.nextDouble();
		Student student = new Student(this.name, this.lastName, 
				this.grade, this.studentId, this.newStudent);
		arr[studentCount++] = student;
		return arr;
	}
//a method to print the student info
	public void studentInfo(Student[] arr, Integer studentCount, Scanner scanner) {
		for (int i = 0; i < studentCount; i++) {
			System.out.println((i + 1) + ". " + arr[i].name);
		}
		System.out.println("Select a student from the list, to view their information:");
		int seleccion = scanner.nextInt();
		arr[seleccion - 1].print();
	}
	
	//a method to calculate the average grade of the group
	public void calculateGrade(double avg, Integer studentCount, Student[] arr) {
		for (int i = 0; i < studentCount; i++) {
			avg += arr[i].grade;

		}
		System.out.println("El promedio del grupo es: " + avg / studentCount+"\n");
		
	}

}

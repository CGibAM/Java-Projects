package com.learning.average;

import java.util.Scanner;

public class Group {
	Student student= new Student();

	public static void main(String[] args) {
		Group group = new Group();
		group.start();

	}

	private void start() { //First we create an array of students
		Student[] arr = new Student[10];
		Integer studentCount = 0; //Student count so we know how many students are on the group
		double avg = 0;//To calculate average group score 
		Scanner scanner = new Scanner(System.in);//To receive info from an input
		Integer menu = 0;//Variable to control the menu flow
		System.out.println("Welcome to the school information system");
		while (menu != 4) {
			menu();
			
			menu = scanner.nextInt();
			switch (menu) {
			//We call the methods from the student class
			case 1:
				student.addStudent(arr, scanner, studentCount);
				studentCount++;
				break;
				
			case 2:
				student.studentInfo(arr,studentCount, scanner);
				break;

			case 3:
				student.calculateGrade(avg, studentCount, arr);
				break;

			case 4:
				break;

			default://default option for incorrect input selection
				System.out.println("Please select a valid option");
				break;
			}

		}
		scanner.close();
	}

	private void menu() {
		System.out.println("1.- Register new student");
		System.out.println("2.- See informtaion from the student");
		System.out.println("3.- See group avarage score");
		System.out.println("4.- Exit out of the programm");

	}

}

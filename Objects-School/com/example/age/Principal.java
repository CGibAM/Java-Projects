package com.example.age;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Principal principal=new Principal();
		principal.start();//to start the current method
	}

	private void start() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Hi, fill the student info:");
		System.out.println("Name:");
		String name=scanner.next();
		
		System.out.println("Id:");
		String id=scanner.next();
		
		System.out.println("Group:");
		Integer group=scanner.nextInt();
		
		System.out.println("Grade:");
		Double grade=scanner.nextDouble();
		
		System.out.println("Is graduated?:");
		Boolean graduated=scanner.nextBoolean();
		
		Student student = new Student();
		student.name = name;
		student.id =id;
		student.group= group;
		student.grade=grade;
		student.graduated=graduated;
		
		student.isGraduated();
		
		System.out.println("Indicate school info:");
		System.out.println("Name:");
		String schoolName=scanner.next();
		
		System.out.println("Number of classrooms");
		Integer schoolRooms=scanner.nextInt();
		
		System.out.println("Number of schoolyards");
		Integer schoolYards=scanner.nextInt();
		
		System.out.println("Does it have a hymn?");
		Boolean hymn=scanner.nextBoolean();
		
		
		School escuela= new School();
		escuela.studentName=schoolName;
		escuela.classrooms=schoolRooms;
		escuela.schoolyard=schoolYards;
		escuela.hymns=hymn;
		escuela.student=student;
		escuela.graduated();
		
	
		scanner.close();
	}

}
